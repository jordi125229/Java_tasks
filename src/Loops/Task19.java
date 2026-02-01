package Loops;

import java.util.Scanner;

class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number of rating");
        double ratings = sc.nextInt();
        double result = 0;

        for (int i = 0; i < ratings; i++) {
            System.out.println("Provide the ratings in sequence");
            double rating = sc.nextDouble();
            result += rating;
        }
        System.out.println(result / ratings);
    }
}
