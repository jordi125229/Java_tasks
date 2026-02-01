package currency;

class CurrencyTest {
    public static void main(String[] args) {
        for (Currency value : Currency.values()) {
            System.out.println(value + " - " + value.symbol);
        }
    }
}
