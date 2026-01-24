package Arrays;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task11 test = new Task11();

        System.out.println("Podaj dlugosc tablicy");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        test.arrayInsert(array, sc);
        test.arrayChange(array);
        test.arrayPriner(array);
    }

    void arrayInsert(int[] array, Scanner sc) {
        System.out.println("Wczytaj elementy tablicy");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    void arrayChange(int[] array){
        int first = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = first;
    }
    void arrayPriner(int[] array) {
        System.out.println("Wypisz elementy tablicy:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
