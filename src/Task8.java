import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task8 test = new Task8();

        System.out.println("Podaj dlugosc tablicy");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        test.arrayInsert(array, sc);
        test.arrayPriner(array);
        test.findNumber(array);
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

    void findNumber(int[] array){
        System.out.println("Wczytaj liczbę");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int xQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]){
                xQuantity++;
            }
        }
        if (xQuantity > 0){
            System.out.println("Znaleziono");
        } else {
            System.out.println("Nie znaleziono");
        }
    }
}
