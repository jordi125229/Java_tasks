package Loops;

import java.util.Scanner;

class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę ocen");
        double assesments = sc.nextInt();
        double result = 0;

        for (int i = 0; i < assesments; i++) {
            System.out.println("Podaj oceny po kolei");
            double assesment = sc.nextDouble();
            result += assesment;
        }
        System.out.println(result / assesments);
    }
}
