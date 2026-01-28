import java.util.Scanner;

class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz zdanie");
        String sentence = sc.nextLine();

        String replaced = sentence.replace(' ', '_').replace(",","");

        System.out.println(replaced);

    }
}
