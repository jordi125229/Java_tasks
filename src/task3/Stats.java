package task3;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array can't be null");
        }
        this.data = data;
    }

    public double mean() {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i].doubleValue();
        }
        return sum / data.length;
    }

    public double variance() {
        double mean = mean();
        double sumSqrt = 0;
        for (T value : data) {
            double diff = value.doubleValue() - mean;
            sumSqrt += diff * diff;
        }
        return sumSqrt / data.length;
    }

   public boolean hasSameMean(Stats<?> other, double eps) {
       double m1 = this.mean();
       double m2 = other.mean();
       return Math.abs(m1 - m2) <= eps;
   }
}