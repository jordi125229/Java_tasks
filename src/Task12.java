import java.util.Scanner;

class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task12 test = new Task12();

        System.out.println("Podaj dlugosc tablic");
        int arrayLength = sc.nextInt();
        int[] array1 = new int[arrayLength];

        test.arrayInsert(array1, sc);

        int[] array2 = new int[arrayLength];
        test.arrayInsert(array2, sc);

        int[] i = test.newArray(array1, array2, arrayLength);

        test.arrayPriner(i);
    }

    void arrayInsert(int[] array, Scanner sc) {
        System.out.println("Wczytaj elementy nowej tablicy");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    int[] newArray(int[] ar1, int[] ar2, int arrayLenght) {
        int[] ar3 = new int[arrayLenght];
        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i] + ar2[i];
        }
        return ar3;
    }
    void arrayPriner(int[] array) {
        System.out.println("Wypisz elementy tablicy:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
