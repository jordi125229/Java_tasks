package app.booking;

import money.Money;
import resources.Resource;
import users.User;

import java.util.Map;

class Booking {
    String id;
    User user;
    Resource resource;

    BookingStatus status;
    Money calculatedPrice;
}
