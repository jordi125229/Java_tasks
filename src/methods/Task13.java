package methods;

class Task13 {
    public static void main(String[] args) {
        Task13 test = new Task13();
        int[] array = new int[]{50,61,-2,94,2};
        test.arrayPritner(array);

        int[] ints = test.odwrocTablice(array);
        test.arrayPritner(ints);
    }

    int[] odwrocTablice(int[] array) {
        System.out.println("Wypisz elementy tablicy:");
        for (int i = 0; i < array.length /2; i++) {
            int n = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = n;
        }
        return array;
    }

    public void arrayPritner(int[] array){
        for (int j : array) {
            System.out.println(j);
        }
    }
}
