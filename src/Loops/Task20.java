package Loops;

import java.util.Scanner;

class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide word or phrase");
        String word = sc.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
