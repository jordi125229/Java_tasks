
import java.time.*;
import java.time.zone.ZoneRulesException;

public class Flight {
    String flightNumber;
    String departureAirport;
    String arrivalAirport;
    ZonedDateTime departureTime;
    ZonedDateTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        if (arrivalTime.isBefore(departureTime)) {
            throw new IllegalArgumentException("Arrival time can't be before departure time");
        }
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Duration calculateFlightDuration() {
        return Duration.between(departureTime.toInstant(), arrivalTime.toInstant());
    }

    public static String format(Duration d) {
        long hours = d.toHours();
        long minutes = d.toMinutesPart();
        return hours + "h " + minutes + "m";
    }

    public static Flight createFlight(String flightNumber, String departureAirport, String arrivalAirport, LocalDateTime departureTime, String departureZone, LocalDateTime arrivalTime, String arrivalZone) {
        ZonedDateTime zonedDateTimeDeparture = zoneTimeCreation(departureTime, departureZone);
        ZonedDateTime zonedDateTimeArrival = zoneTimeCreation(arrivalTime, arrivalZone);
        return new Flight(flightNumber, departureAirport, arrivalAirport, zonedDateTimeDeparture, zonedDateTimeArrival);
    }

    private static ZonedDateTime zoneTimeCreation(LocalDateTime departureTime, String zoneId) {
        try {
            return ZonedDateTime.of(departureTime, ZoneId.of(zoneId));
        } catch (ZoneRulesException e){
            throw new DateTimeException("Wrong data zone");
        }
    }

    @Override
    public String toString() {
        return "Flight: flightNumber: " + flightNumber + '\'' +
                ", departureAirport: " + departureAirport + '\'' +
                ", arrivalAirport: " + arrivalAirport + '\'' +
                ", departureTime: " + departureTime +
                ", arrivalTime: " + arrivalTime;
    }
}
