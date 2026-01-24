package Loops;

import java.util.Scanner;

class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int num = sc.nextInt();

        int max = 0;

        while (num > 0) {
            int i = num % 10;
            if (i > max) {
                max = i;
            }
            num = num / 10;
        }
        System.out.println("Max cyfra: " + max);
    }
}
