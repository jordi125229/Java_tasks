package Loops;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Provide postivie numver");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("It worked");
    }
}
