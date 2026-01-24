import java.util.Scanner;

class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Wpisz liczby do tablicy");
        insert(array, sc);

        System.out.println(sum(array));
    }

    public static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static void insert(int[][] notes, Scanner sc) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = sc.nextInt();
            }
        }
    }
}
