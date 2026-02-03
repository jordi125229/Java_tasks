import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert product's amount");

        int productsAmount = sc.nextInt();
        BigDecimal[] array = new BigDecimal[productsAmount];
        System.out.println("Insert product's prices");

        System.out.println(calculateAverage(priceInsert(array, sc)));
    }

    static BigDecimal[] priceInsert(BigDecimal[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextBigDecimal();
        }
        return array;
    }

    static BigDecimal calculateAverage(BigDecimal[] array) {
        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < array.length; i++) {
            sum = sum.add(array[i]);
        }
        return sum.divide(BigDecimal.valueOf(array.length), 2, RoundingMode.HALF_UP);
    }
}
