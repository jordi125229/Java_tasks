import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 23, 0)
                , "Europe/Warsaw", LocalDateTime.of(2025, 1, 16, 1, 30), "Europe/Warsaw");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 23, 0)
                , "Europe/Warsaw", LocalDateTime.of(2025, 1, 16, 1, 30), "Europe/Warsaw");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 10, 0)
                , "Europe/Warsaw", LocalDateTime.of(2025, 1, 15, 14, 0), "America/New_York");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 3, 30, 1, 0), "Europe/Warsaw",
                LocalDateTime.of(2025, 3, 30, 5, 0), "Europe/Warsaw");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 10, 26, 1, 0), "Europe/Warsaw",
                LocalDateTime.of(2025, 10, 26, 2, 30), "Europe/Warsaw");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 10, 0), "Asia/Tokyo",
                LocalDateTime.of(2025, 1, 14, 18, 0), "America/Los_Angeles");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 10, 0), "Asia/Tokyo",
                LocalDateTime.of(2025, 1, 15, 8, 0), "America");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 10, 0), "Europe/Warsaw",
                LocalDateTime.of(2025, 1, 14, 18, 0), "Europe/Warsaw");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 10, 0)
                , "Europe/Warsaw", LocalDateTime.of(2025, 1, 15, 19, 0), "Asia/Kolkata");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 6, 0)
                , "Europe/Warsaw", LocalDateTime.of(2025, 1, 16, 6, 0), "Asia/Singapore");

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 8, 0)
                , "Europe/Warsaw", LocalDateTime.of(2025, 1, 15, 12, 0), "Europe/London");
        testCounter--;

        runTest("50311", "Modlin", "Heathrow", LocalDateTime.of(2025, 1, 15, 16, 0)
                , "Europe/London", LocalDateTime.of(2025, 1, 15, 20, 0), "Europe/Warsaw");
    }

    private static void runTest(String flightNumber, String from, String to, LocalDateTime departure, String departureZone, LocalDateTime arrival, String arrivalZone) {
        try {
            System.out.println("Test: " + testCounter);
            runFlight(flightNumber, from, to, departure, departureZone, arrival, arrivalZone);
        } catch (IllegalArgumentException | DateTimeException e) {
            System.out.println(e.getMessage() + "\n");
        }
        testCounter++;
    }

    static int testCounter = 1;

    private static void runFlight(String flightNumber, String departureAirport, String arrivalAirport, LocalDateTime departureTime, String departureZone,
                                  LocalDateTime arrivalTime, String arrivalZone) {
        Flight flight = Flight.createFlight(flightNumber, departureAirport, arrivalAirport, departureTime, departureZone, arrivalTime, arrivalZone);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(flight);
        System.out.println(Flight.format(duration) + "\n");
    }
}
