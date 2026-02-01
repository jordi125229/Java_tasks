package Loops;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int sum;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sum = n++;
            if (sum % 7 == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}
