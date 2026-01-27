import java.util.Scanner;

class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz slowo");
        String sentence = sc.nextLine();
        System.out.println("Wpisz drugie slowo");
        String sentence2 = sc.nextLine();

        boolean firstComparision = sentence.equals(sentence2);
        System.out.println(firstComparision);

        boolean secondComparision = sentence.equalsIgnoreCase(sentence2);
        System.out.println(secondComparision);

    }
}
