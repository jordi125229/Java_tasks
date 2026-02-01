package Arrays;

class Task20 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillArray(array);
        printer(array);
//        change(array);
        System.out.println("Nowa tablica");
//        printer(array)
        changeCross(array);
        printer(array);
    }
    static int[][] change(int[][] array){
        int[] firstRow = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstRow;
        return array;
    }

    static int[][] changeCross(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i][i];
            array[i][i] = array[i][array.length - 1 - i];
            array[i][array.length - 1 - i] = i1;
        }
        return array;
    }


    private static void printer(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "; ");
            }
            System.out.println();
        }
    }
    private static void fillArray(int[][] array) {
        int first = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = first++;
            }
        }
    }
}