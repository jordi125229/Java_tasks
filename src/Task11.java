import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz tekst");

        String text = sc.nextLine();
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        StringBuilder reversed = new StringBuilder(text).reverse();
        System.out.println(reversed);
    }
}
