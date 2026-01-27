import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cene");
        String price = sc.nextLine();

        BigDecimal priceBd = new BigDecimal(price);
        BigDecimal vat = new BigDecimal("0.23");

        BigDecimal grossPrice = priceBd.add(priceBd.multiply(vat)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(grossPrice);
    }
}
