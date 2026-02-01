package planet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Planet {
    MERCURY(new BigDecimal("3.3011e23"), new BigDecimal("2439700")),
    VENUS(new BigDecimal("4.8675e24"), new BigDecimal("6051800")),
    EARTH(new BigDecimal("5.97237e24"), new BigDecimal("6371000"));

    BigDecimal mass;
    BigDecimal radius;
    static BigDecimal PI = new BigDecimal("3.14");

    Planet(BigDecimal mass, BigDecimal radius) {
        this.mass = mass;
        this.radius = radius;
    }

    BigDecimal getDensity() {
        BigDecimal volume = (new BigDecimal("4").divide(new BigDecimal("3"), 10, RoundingMode.HALF_UP))
                .multiply(PI)
                .multiply(radius.pow(3));

        return mass.divide(volume, 20, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", radius=" + radius +
                '}';
    }
}
