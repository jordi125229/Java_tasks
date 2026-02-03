package resources;

import money.Money;

import java.util.List;
import java.util.Optional;

class Device extends Resource implements ResourceRepository {
    private int quantity;

    public Device(String name, Money customHourlyRate, int quantity) {
        super(name, customHourlyRate);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    protected Money baseRatePerHour() {
        return null;
    }

    @Override
    public String describe() {
        return "Name: " + name + "; Custom hourly rate: " + customHourlyRate
                + "; device's quantity possible to book " + quantity;
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
