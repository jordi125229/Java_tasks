package money;

class CardPayment extends Payment{
    String last4;

    @Override
    void capture() {
        if (status == PaymentStatus.INITIATED){
            status = PaymentStatus.CAPTURED;
        }
    }
}
