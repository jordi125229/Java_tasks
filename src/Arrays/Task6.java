package Arrays;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Task6 test = new Task6();

    System.out.println("Podaj dlugosc tablicy");
    int arrayLength = sc.nextInt();
    int[] array = new int[arrayLength];

    test.arrayInsert(array, sc);
    test.arrayPriner(array);
    test.findTheBiggest(array);

}

    void arrayInsert(int[] array, Scanner sc) {
        System.out.println("Wczytaj elementy tablicy");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    void arrayPriner(int[] array) {
        System.out.println("Wypisz elementy tablicy:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    void findTheBiggest(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];  //tu uzylem chata bo zamulilem, i nadpisywalem array[i] = max i zwieche zlapalem z tym bo nie wiedzialem co jest zle
            }
        }
        System.out.println("Największa liczba z tablicy to: " + max);
    }
}
