import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert price in PLN");
        BigDecimal pln = sc.nextBigDecimal();
        System.out.println("Insert exchange rate pln/eur");
        BigDecimal eurFxRate = sc.nextBigDecimal();

        BigDecimal result = pln.multiply(eurFxRate);
        System.out.println(result);
    }
}
