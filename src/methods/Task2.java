package methods;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczby");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int result = mult(i1, i2);
        numberPrinter(result);
    }

    static int mult(int a, int b){
        int result = a * b;
        return result;
    }
    static void numberPrinter(int a){
         System.out.println(a);
    }
}
