import java.util.Scanner;

class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert phrase");
        String sentence = sc.nextLine();

        System.out.println("Insert word");
        String word = sc.nextLine();

        boolean contains = sentence.contains(word);
        System.out.println(contains);

        int position = sentence.indexOf(word);
        System.out.println(position);
    }
}
