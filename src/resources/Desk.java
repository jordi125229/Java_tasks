package resources;

import money.Money;

class Desk extends Resource{
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
}


