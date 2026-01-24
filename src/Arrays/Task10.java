package Arrays;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task10 test = new Task10();

        System.out.println("Podaj dlugosc tablicy");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        test.arrayInsert(array, sc);
        test.arrayReversalPriner(array);
    }

    void arrayInsert(int[] array, Scanner sc) {
        System.out.println("Wczytaj elementy tablicy");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    void arrayReversalPriner(int[] array) {
        System.out.println("Wypisz elementy tablicy odwrócone:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
