package Loops;

import java.util.Scanner;

class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
