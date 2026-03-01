package task12;

public class Test {
    public static void main(String[] args) {
        Average average = new Average();
        double[] ratings = {3.0, 4.5, 5.0};
        double[] weights  = {1.0, 2.0, 3.0};
        double summedWeight = getSumWeight(weights);

        double sum = 0.0;
        for (int i = 0; i < ratings.length; i++) {
            sum += average.weightedAverage.apply(ratings[i], weights[i], summedWeight);
        }
        double weightedAverage = sum;
        System.out.println(weightedAverage);
    }

    private static double getSumWeight(double[] weights) {
        double sum = 0;
        for (double weight : weights) {
            sum += weight;
        }
        return sum;
    }
}
