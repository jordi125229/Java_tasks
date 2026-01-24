package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(arrayFill(n)));
    }

    static int[] arrayFill(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
