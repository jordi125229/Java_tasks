package money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {
    private final BigDecimal amount;

    private static final int SCALE = 2;
    private static final RoundingMode ROUNDING = RoundingMode.HALF_UP;

    public Money(BigDecimal amount) {
        BigDecimal scaled = amount.setScale(SCALE, ROUNDING);
        this.amount = scaled;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static Money of(String value) {
        if (value.startsWith("-")){
            System.out.println("The amount can't be negative");
        } return new Money(new BigDecimal(value));
    }

    public Money add(Money other) {
        return new Money(amount.add(other.amount));
    }

    public Money subtract(Money other) {
        return new Money(amount.subtract(other.amount));
    }

    public Money multiply(BigDecimal m) {
        return new Money(amount.multiply(m));
    }

    @Override
    public String toString() {
        return amount + " " + "PLN";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}
