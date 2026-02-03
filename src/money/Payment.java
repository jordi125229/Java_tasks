package money;

abstract public class Payment {
    Money amount;
    String paymentId;
    PaymentStatus status;

    abstract void capture();

}
