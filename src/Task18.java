import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert price's amount:");
        int productsAmount = sc.nextInt();
        BigDecimal[] bigDecimals = new BigDecimal[productsAmount];

        System.out.println("Insert prices: ");

        inser(bigDecimals, sc);
        print(bigDecimals);
    }

    private static void inser(BigDecimal[] bigDecimals, Scanner sc) {
        for (int i = 0; i < bigDecimals.length; i++) {
            bigDecimals[i] = sc.nextBigDecimal();
        }
    }

    private static void print(BigDecimal[] bigDecimals) {
        for (BigDecimal bigDecimal : bigDecimals) {
            System.out.println(bigDecimal.setScale(2, RoundingMode.HALF_UP) + " PLN");
        }
    }
}
