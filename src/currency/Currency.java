package currency;

public enum Currency {
    PLN("zl"),
    USD("$"),
    EUR("€");

    final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
