package Loops;

import java.util.Scanner;

class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number range");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        for (int i = i1; i <= i2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
