package task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Average {
    TriFunction<BigDecimal, BigDecimal, BigDecimal, BigDecimal> weightedAverage = (rating, weight, maxWeight) -> {
        return rating.multiply(weight).divide(maxWeight, 10, RoundingMode.HALF_UP);
    };
}
