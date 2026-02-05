package Order;

class OrderStatusTest {
    public static void main(String[] args) {
        boolean active = OrderStatus.NEW.isActive();
        boolean active1 = OrderStatus.CANCELED.isActive();
        boolean active2 = OrderStatus.SHIPPED.isActive();
        System.out.println(active);
        System.out.println(active1);
        System.out.println(active2);
    }
}
