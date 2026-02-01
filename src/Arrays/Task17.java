package Arrays;

import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        System.out.println("Wpisz liczby do tablicy");
        insert(array, sc);
        sumColumns(array);

    }

    private static void insert(int[][] notes, Scanner sc) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = sc.nextInt();
            }
        }
    }
    static void sumColumns(int[][] array){
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
                for (int j = 0; j < array.length; j++) {
                sum += array[j][i]; //uzylem AI, bo mylilem indeksy i outofbound exception wyrzucalo mi
            }
            System.out.println(sum);
        }
    }
}


