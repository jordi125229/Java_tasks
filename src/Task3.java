import java.math.BigDecimal;
import java.math.RoundingMode;

class Task3 {
    public static void main(String[] args) {
        BigDecimal test = new BigDecimal("10.56789");
        BigDecimal bigDecimal = test.setScale(2, RoundingMode.HALF_UP);

        System.out.println(bigDecimal);
    }
}
