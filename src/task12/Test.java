package task12;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Average average = new Average();
        BigDecimal[] ratings = {new BigDecimal("3.0"), new BigDecimal("4.5"), new BigDecimal("5.0")};
        BigDecimal[] weights = {new BigDecimal("1.0"), new BigDecimal("2.0"), new BigDecimal("3.0")};
        BigDecimal summedWeight = getSumWeight(weights);

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < ratings.length; i++) {
            sum = sum.add(average.weightedAverage.apply(ratings[i], weights[i], summedWeight));
        }
        BigDecimal weightedAverage = sum;
        System.out.println(weightedAverage);
    }

    private static BigDecimal getSumWeight(BigDecimal[] weights) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal weight : weights) {
            sum = sum.add(weight);
        }
        return sum;
    }
}
