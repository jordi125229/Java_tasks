package task12;

public class Average {
    TriFunction<Double, Double, Double, Double> weightedAverage = (rating, weight, maxWeight) -> {
        return rating * weight / maxWeight;
    };
}
