package Arrays;

import java.util.Scanner;

class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        System.out.println("Wpisz liczby do tablicy");
        insert(array, sc);
        sum(array);
    }

    public static void sum(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }
    }

    private static void insert(int[][] notes, Scanner sc) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = sc.nextInt();
            }
        }
    }
}


