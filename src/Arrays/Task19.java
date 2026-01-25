package Arrays;

class Task19 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        fillArray(array);
        printer(array);
        crossPrinter(array);

    }

    private static void fillArray(int[][] notes) {
        int first = 1;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = first++;
            }
        }
    }
    private static void printer(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "; ");
            }
            System.out.println();
        }
    }

    static void crossPrinter(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
                i++;
            }
        }
    }
}
/*tu drukuje jak trzeba ale na koncu wyrzuca array index ouf of bond excepiton bo dodaje do i i odwoluje sie do czegos powyzej array.length
Nie wiem jak sie zabezpieczyc przed tym
 */