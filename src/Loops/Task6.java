package Loops;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = sc.nextInt();

        while (n >= 0){
            System.out.println(n);
            n--;
        }
    }
}
