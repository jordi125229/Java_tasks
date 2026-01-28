import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe produktu:");
        String name = sc.nextLine();

        System.out.println("Podaj cenę");
        BigDecimal price = sc.nextBigDecimal();

        System.out.println("Product: " + name.toUpperCase()
                + ", price: " + price.setScale(2, RoundingMode.HALF_UP) + " PLN");
    }
}
