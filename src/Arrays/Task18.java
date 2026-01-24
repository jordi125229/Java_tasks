package Arrays;

import java.util.Scanner;

class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = getArraySize(sc);

        insert(array, sc);
        findTheBiggest(array);
    }

    private static int[][] getArraySize(Scanner sc) {
        System.out.println("Wpisz wymiary tablicy");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];
        return array;
    }

    public static void findTheBiggest(int[][] array) {
        int max = array[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("Największy element macierzy wynosi "
                + max + " a jego pozycja wynosi " + "[" + maxRow + "]" + "[" + maxColumn + "]");
    }

    private static void insert(int[][] notes, Scanner sc) {
        System.out.println("Uzupełnij tablicę");
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = sc.nextInt();
            }
        }
    }
}
/*Macierz – element maksymalny**
    - Wczytaj tablicę dwuwymiarową.
    - Znajdź i wypisz największy element macierzy oraz jego pozycję (wiersz, kolumna).
    - Nastepnie znajdź i wypisz trzeci co do wielkosci największy element macierzy*/

