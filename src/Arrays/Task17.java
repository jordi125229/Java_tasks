package Arrays;

import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        int[] arrayColumns = new int[3];
        System.out.println("Wpisz liczby do tablicy");
        insert(array, sc);

    }


    private static void insert(int[][] notes, Scanner sc) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = sc.nextInt();
            }
        }
    }
}

/*Macierz – suma kolumn**
        - Wczytaj tablicę dwuwymiarową 2x3 z liczbami całkowitymi.
        - Oblicz sumę każdej kolumny osobno i wypisz wyniki*/

/*w trakcie*/

