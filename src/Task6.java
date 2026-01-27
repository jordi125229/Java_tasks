import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczby");
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        BigDecimal i1 = new BigDecimal(input1);
        BigDecimal i2 = new BigDecimal(input2);

        int result = i1.compareTo(i2);
        comparing(result);
    }

    static void comparing(int result){
        if (result > 0){
            System.out.println("Większa jest pierwsza liczba");
        } else if (result < 0) {
            System.out.println("Druga liczba jest wieksza");
        } else {
            System.out.println("Liczby są równe");
        }
    }
}
