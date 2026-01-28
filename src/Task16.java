import java.util.Scanner;

class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz tekst");
        String phrase = sc.nextLine();

        boolean startWithJava = phrase.startsWith("Java".toLowerCase());
        boolean endsWithJava = phrase.endsWith("2025");

        System.out.println(startWithJava);
        System.out.println(endsWithJava);
    }
}
