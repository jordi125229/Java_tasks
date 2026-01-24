package Loops;

import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę i jej wykładnik");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int sum = i1;

        for (int i = 1; i < i2; i++) {
            sum *= i1;
        }
        System.out.println(sum);
    }
}
