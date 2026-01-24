package Loops;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'){
                System.out.println(i + 1);
                break;
            }
        }
        if (!word.contains("a")){
            System.out.println("Brak litery 'a'");
        }
    }
}
