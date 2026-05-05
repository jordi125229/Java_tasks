package com.example.reservation;

import com.example.reservation.reservation.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("ReservationService - zaawansowane mockowanie")
class ReservationServiceTest {

    @Mock
    private RoomRepository roomRepository;

    @Mock
    private ReservationRepository reservationRepository;

    @Mock
    private ReservationEmailService emailService;

    @Mock
    private ConfirmationCodeGenerator codeGenerator;

    @Mock
    private EventPublisher eventPublisher;

    @InjectMocks
    private ReservationService reservationService;

    @Captor
    private ArgumentCaptor<Reservation> reservationCaptor;

    @Captor
    private ArgumentCaptor<ConfirmationEmail> emailCaptor;

    @Captor
    private ArgumentCaptor<String> stringCaptor;  // to do usuniecia moim zdaniem

    private Room room;
    private TimeSlot timeSlot;
    private String generatedCode;  // to dodalem
    private int attendees;  // to dodalem

    @BeforeEach
    void setUp() {
        room = new Room("ROOM-A", "Sala Konferencyjna A", 20, true);
        timeSlot = new TimeSlot(
                LocalDate.of(2026, 6, 15),
                LocalTime.of(10, 0),
                LocalTime.of(12, 0)
        );
        attendees = 1; // to dodalem
    }

    private void setupSuccessfulReservation() {
        when(roomRepository.findById(room.getRoomId())).thenReturn(Optional.of(room));
        when(reservationRepository.existsByRoomIdAndTimeSlot(room.getRoomId(), timeSlot)).thenReturn(false);
        generatedCode = "RES-A1B2C3D4";
        when(codeGenerator.generate()).thenReturn(generatedCode);
        when(reservationRepository.save(any(Reservation.class))).thenAnswer(invocation -> invocation.getArgument(0));
    }

    @Nested
    @DisplayName("ArgumentCaptor - weryfikacja zapisanych danych")
    class ArgumentCaptorTests {

        @Test
        @DisplayName("Powinien zapisać rezerwację z poprawnymi danymi")
        void shouldSaveReservationWithCorrectData() {
            // Arrange
            setupSuccessfulReservation();

            // Act
            reservationService.createReservation(room.getRoomId(), "email", timeSlot, attendees);

            // Assert
            verify(reservationRepository).save(reservationCaptor.capture());
            Reservation value = reservationCaptor.getValue();
            assertEquals(room.getRoomId(), value.getRoomId());
            assertEquals("email", value.getOrganizerEmail());
            assertEquals(attendees, value.getAttendees());
            assertEquals(generatedCode, value.getConfirmationCode());
            assertEquals(ReservationStatus.CONFIRMED, value.getStatus());
        }

        @Test
        @DisplayName("Powinien wysłać email z poprawną treścią")
        void shouldSendEmailWithCorrectContent() {
            //Arrange
            setupSuccessfulReservation();

            // Act
            reservationService.createReservation(room.getRoomId(), "email", timeSlot, attendees);

            // Assert
            verify(emailService).sendConfirmation(emailCaptor.capture());
            ConfirmationEmail confirmationEmail = emailCaptor.getValue();
            assertEquals("email", confirmationEmail.getRecipientEmail());
            assertThat(confirmationEmail.getBody())
                    .contains(generatedCode)
                    .contains(timeSlot.getDate().toString());
        }

        @Test
        @DisplayName("Powinien opublikować zdarzenie z danymi rezerwacji")
        void shouldPublishEventWithReservationDetails() {
            // Arrange
            setupSuccessfulReservation();
            ArgumentCaptor<String> detailCaptor = ArgumentCaptor.forClass(String.class);
            ArgumentCaptor<String> eventCaptor = ArgumentCaptor.forClass(String.class);

            // Act
            reservationService.createReservation(room.getRoomId(), "email", timeSlot, attendees);

            // Assert
            verify(eventPublisher).publish(eventCaptor.capture(), detailCaptor.capture());
            String event = eventCaptor.getValue();
            String detail = detailCaptor.getValue();
            assertEquals("RESERVATION_CREATED", event);
            assertThat(detail)
                    .contains(generatedCode)
                    .contains(room.getName());
        }
    }

    @Nested
    @DisplayName("InOrder - weryfikacja kolejności operacji")
    class InOrderTests {

        @Test
        @DisplayName("Powinien wykonać operacje w odpowiedniej kolejności")
        void shouldExecuteOperationsInCorrectOrder() {
            // Arrange
            setupSuccessfulReservation();

            // Act
            reservationService.createReservation(room.getRoomId(), "email", timeSlot, attendees);

            // Assert
            InOrder inOrder = inOrder(roomRepository, reservationRepository, codeGenerator, emailService, eventPublisher);
            inOrder.verify(roomRepository).findById(room.getRoomId());
            inOrder.verify(reservationRepository).existsByRoomIdAndTimeSlot(room.getRoomId(), timeSlot);
            inOrder.verify(codeGenerator).generate();
            inOrder.verify(reservationRepository).save(any());
            inOrder.verify(emailService).sendConfirmation(any());
            inOrder.verify(eventPublisher).publish(anyString(), anyString());
        }
    }

    @Nested
    @DisplayName("thenAnswer - dynamiczne generowanie wyników")
    class ThenAnswerTests {

        @Test
        @DisplayName("Powinien generować unikalne kody dla kolejnych rezerwacji")
        void shouldGenerateUniqueCodesForMultipleReservations() {
            // Arrange
            AtomicInteger counter = new AtomicInteger(1);
            AtomicInteger counterReservationCode = new AtomicInteger(1);
            when(roomRepository.findById(room.getRoomId())).thenReturn(Optional.of(room));
            when(codeGenerator.generate()).thenAnswer(invocation -> "RES-" + counter.getAndIncrement());
            when(reservationRepository.save(any(Reservation.class))).thenAnswer(invocation -> {
                Reservation reservation = invocation.getArgument(0);
                reservation.setId((long) counterReservationCode.getAndIncrement());
                return reservation;
            });

            // Act
            Reservation reservation1 = reservationService.createReservation(room.getRoomId(), "email1", timeSlot, attendees);
            Reservation reservation2 = reservationService.createReservation(room.getRoomId(), "email", timeSlot, 2);

            // Assert
            assertEquals("RES-1", reservation1.getConfirmationCode());
            assertEquals("RES-2", reservation2.getConfirmationCode());

            assertEquals(1L, reservation1.getId());
            assertEquals(2L, reservation2.getId());
        }
    }

    @Nested
    @DisplayName("Walidacja - testy błędów")
    class ValidationTests {

        @Test
        @DisplayName("Powinien rzucić wyjątek gdy sala nie istnieje")
        void shouldThrowWhenRoomNotFound() {
            // Arrange
            when(roomRepository.findById(room.getRoomId())).thenReturn(Optional.empty());

            // Assert
            assertThrows(IllegalArgumentException.class, () -> reservationService.createReservation(room.getRoomId(), "email", timeSlot, 1));
            verifyNoInteractions(reservationRepository);
            verifyNoInteractions(codeGenerator);
            verifyNoInteractions(emailService);
            verifyNoInteractions(eventPublisher);
        }

        @Test
        @DisplayName("Powinien rzucić wyjątek gdy za dużo uczestników")
        void shouldThrowWhenTooManyAttendees() {
            // Arrange
            when(roomRepository.findById(room.getRoomId())).thenReturn(Optional.of(room));

            // Assert
            assertThrows(IllegalArgumentException.class, () -> reservationService.createReservation(room.getRoomId(), "email", timeSlot, 21));
            verifyNoInteractions(emailService);
            verifyNoInteractions(eventPublisher);
        }

        @Test
        @DisplayName("Powinien rzucić wyjątek gdy termin zajęty")
        void shouldThrowWhenTimeSlotAlreadyBooked() {
            // Assert
            when(roomRepository.findById(room.getRoomId())).thenReturn(Optional.of(room));
            when(reservationRepository.existsByRoomIdAndTimeSlot(room.getRoomId(), timeSlot)).thenReturn(true);

            // Assert
            assertThrows(IllegalStateException.class, () -> reservationService.createReservation(room.getRoomId(), "email", timeSlot, 1));
            verifyNoInteractions(codeGenerator);
            verify(reservationRepository, never()).save(any());
        }
    }
}


