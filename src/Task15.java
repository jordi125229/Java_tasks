import java.util.Scanner;

class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert phrase");
        String sentence = sc.nextLine();

        String[] wordsSeparated = sentence.split(" ");
        print(wordsSeparated);
    }

    static void print(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
