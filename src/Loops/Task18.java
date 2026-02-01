package Loops;

import java.util.Scanner;

class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = 0;

        do {
            System.out.println("Provide number");
            n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        System.out.println(max);
    }
}
