package task3;

class Test {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, 4};
        Stats<Integer> integerStats = new Stats<>(a);
        double mean = integerStats.mean();
        System.out.println(mean);

        double variance = integerStats.variance();
        System.out.println(variance);
    }
}
