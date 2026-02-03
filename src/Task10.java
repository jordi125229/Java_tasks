import java.math.BigDecimal;

class Task10 {
    public static void main(String[] args) {
        double result = add(0.1, 0.2);
        System.out.println(result);

        BigDecimal result2 = add(new BigDecimal("0.1"), new BigDecimal("0.2"));
        System.out.println(result2);
    }

    static double add(double i1, double i2) {
        return i1 + i2;
    }

    static BigDecimal add(BigDecimal i1, BigDecimal i2) {
        return i1.add(i2);
    }
}
