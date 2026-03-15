import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert product's name");
        String name = sc.nextLine();

        System.out.println("Insert price");
        BigDecimal price = sc.nextBigDecimal();

        System.out.println("Product: " + name.toUpperCase() + ", price: " + price.setScale(2, RoundingMode.HALF_UP) + " PLN");
    }
}
