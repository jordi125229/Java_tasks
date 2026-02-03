import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cene");
        String price = sc.nextLine();
        BigDecimal priceBd = new BigDecimal(price);

        System.out.println("Podaj znizke");
        String discount = sc.nextLine();
        BigDecimal discountBd = new BigDecimal(discount);

        BigDecimal newPrice = priceBd.subtract(priceBd.multiply(discountBd)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(newPrice);
    }
}
