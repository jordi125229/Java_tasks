package Arrays;

class Task14 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        extracted(array);
        printer(array);

    }

    private static void printer(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "; ");
            }
            System.out.println();
        }
    }
    private static void extracted(int[][] notes) {
        int first = 1;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = first++;
            }
        }
    }
}
