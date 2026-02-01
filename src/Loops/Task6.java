package Loops;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int number = sc.nextInt();

        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }
}
