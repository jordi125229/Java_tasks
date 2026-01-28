import java.math.BigDecimal;
import java.util.Scanner;

class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz kwotę rachunku");

        BigDecimal bill = sc.nextBigDecimal();
        System.out.println("Podaj liczbe ludzi");
        int people = sc.nextInt();

        BigDecimal billPerPerson = bill.divide(BigDecimal.valueOf(people));
        System.out.println(billPerPerson);
    }
}
