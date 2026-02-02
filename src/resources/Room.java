package resources;

import money.Money;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Room extends Resource {
    private int seats;
    private Set<String> equipment;

    public Room(String name, Money customHourlyRate, int seats, Set<String> equipment) {
        super(name, customHourlyRate);
        this.seats = seats;
        this.equipment = equipment;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Set<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(Set<String> equipment) {
        this.equipment = equipment;
    }

    @Override
    protected Money baseRatePerHour() {
        return null;
    }

    @Override
    public String describe() {
        return "Name: " + name + "; Custom hourly rate: " + customHourlyRate + "; Seat's number: "
                + seats + "; available equipment: " + equipment;
    }
}
