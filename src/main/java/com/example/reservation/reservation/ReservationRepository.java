package com.example.reservation.reservation;

public interface ReservationRepository {

    Reservation save(Reservation reservation);

    boolean existsByRoomIdAndTimeSlot(String roomId, TimeSlot timeSlot);
}