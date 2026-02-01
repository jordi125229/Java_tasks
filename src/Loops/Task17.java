package Loops;

import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number and its exponent");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = firstNumber;

        for (int i = 1; i < secondNumber; i++) {
            sum *= firstNumber;
        }
        System.out.println(sum);
    }
}
