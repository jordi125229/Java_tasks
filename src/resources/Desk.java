package resources;

import money.Money;

import java.util.List;
import java.util.Optional;

class Desk extends Resource implements ResourceRepository{
    private DeskType deskType;

    public DeskType getDeskType() {
        return deskType;
    }

    public void setDeskType(DeskType desktype) {
        this.deskType = desktype;
    }

    public Desk(String name, Money customHourlyRate, DeskType deskType) {
        super(name, customHourlyRate);
        this.deskType = deskType;
    }

    @Override
    protected Money baseRatePerHour() {
        return null;
    }

    @Override
    public String describe() {
        return "Name: " + name + "; Custom hourly rate: " + customHourlyRate + "; " + deskType;
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


