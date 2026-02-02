package resources;

import money.Money;

class Device extends Resource {
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
}
