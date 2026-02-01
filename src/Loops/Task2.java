package Loops;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
