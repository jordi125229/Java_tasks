package resources;

import money.Money;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Room extends Resource implements ResourceRepository{
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

    @Override
    public void add(Resource r) {
        resources.add(r);
    }

    @Override
    public Optional<Resource> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Resource> findAll() {
        return List.of();
    }
}
