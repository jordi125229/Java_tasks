package methods;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczby");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int w = max(i1, i2);
        numberPrinter(w);
    }

    static int max(int a, int b){
        if (a > b){
            return  a;
        } else {
            return b;
        }
    }
    static void numberPrinter(int a){
        System.out.println(a);
    }
}
