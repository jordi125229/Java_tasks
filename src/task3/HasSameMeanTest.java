package task3;

class HasSameMeanTest {
    public static void main(String[] args) {
        Stats<Double> x = new Stats<>(new Double[]{2.0, 2.0});
        Stats<Double> y = new Stats<>(new Double[]{2.001, 1.999});
        double eps = 0.01;

        boolean result = x.hasSameMean(y, eps);
        System.out.println(result);
    }
}
