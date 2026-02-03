import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert price");

        BigDecimal bigDecimal = sc.nextBigDecimal();
        BigDecimal bigDecimal1 = bigDecimal.setScale(2, RoundingMode.CEILING);

        System.out.println(bigDecimal1);
    }
}
