package Arrays;

import java.util.Scanner;

class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz zdanie:");
        String phrase = sc.nextLine();
        String lowerCase = phrase.replaceAll("\\s+", "").toLowerCase();

        palindrom(lowerCase);
    }

    static void palindrom(String phrase){
        boolean palindrom = true;
        for (int i = 0; i < phrase.length() / 2; i++) {
            if (phrase.charAt(i) != phrase.charAt(phrase.length() - 1 - i)) {
                palindrom = false;
                break;
            }
        }
        if (palindrom){
            System.out.println("Zdanie jest palindromem");
        } else {
            System.out.println("Zdanie nie jest palindromem");
        }
    }
}
