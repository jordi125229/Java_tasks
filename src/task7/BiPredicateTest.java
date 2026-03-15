package task7;

import java.util.Scanner;

public class BiPredicateTest {
    public static void main(String[] args) {
        BiPredicates test = new BiPredicates();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert word: ");
        String word1 = scanner.nextLine();
        System.out.println("Insert second word: ");
        String word2 = scanner.nextLine();
        boolean resultOfTest1 = test.sameIgnoreCase.test(word1, word2);
        boolean resultOfTest2 = test.isSuffix.test(word1, word2);
        System.out.println(resultOfTest1);
        System.out.println(resultOfTest2);
    }
}
