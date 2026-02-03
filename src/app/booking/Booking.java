package app.booking;

import app.FFDateTime;
import money.Money;
import money.Payment;
import resources.Resource;
import users.User;

import java.util.Map;

public class Booking {
    String id;
    User user;
    Resource resource;
    FFDateTime start;
    BookingStatus status;
    Money calculatedPrice;
    Payment payment;
}
