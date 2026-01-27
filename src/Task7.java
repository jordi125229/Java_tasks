import java.math.BigDecimal;

class Task7 {
    public static void main(String[] args) {
        BigDecimal[] array = new BigDecimal[]{
                new BigDecimal("4.5"),
                new BigDecimal("3.2"),
                new BigDecimal("7.8"),
                new BigDecimal("12.3"),
                new BigDecimal("11.99")
        };

        BigDecimal sum = new BigDecimal(0);

        sum = getSum(array, sum);
        System.out.println(sum);
    }

    private static BigDecimal getSum(BigDecimal[] array, BigDecimal sum) {
        for (int i = 0; i < array.length; i++) {
            sum = sum.add(array[i]);
        }
        return sum;
    }
}
