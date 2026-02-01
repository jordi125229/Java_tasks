package Loops;

import java.util.Scanner;

class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        do {
            System.out.println("Podaj liczbę");
            int number = sc.nextInt();
            if (number > 0) {
                sum += number;
            }
            if (number == 0) {
                break;
            }
        } while (true);
        System.out.println(sum);
    }
}
