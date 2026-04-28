package com.example;

public class DiscountCalculator {

    public double calculate(double price, String customerType) {
        if (customerType.equals("VIP")) {
            return price * 0.8;  // 20% zniżki
        } else if (customerType.equals("REGULAR")) {
            return price * 0.95; // 5% zniżki
        }
        return price;
    }

}
