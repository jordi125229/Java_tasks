package money;

import app.booking.Booking;

public interface Billable {

    Invoice invoice(Booking booking);
}
