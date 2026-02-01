package Order;

public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED;

    boolean isActive() {
        if (this == NEW || this == PROCESSING || this == SHIPPED) {
            return true;
        } else {
            return false;
        }
    }
}
