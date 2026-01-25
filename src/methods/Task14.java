package methods;

class Task14 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        int[] array1 = new int[]{4,5,6};
        int[] merge = merge(array, array1);

        for (int i : merge) {
            System.out.println(i);
        }
    }

    static int[] merge(int[] tab1, int[] tab2){
        int[] tab3 = new int[tab1.length + tab2.length];
        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tab3[tab1.length + i] = tab2[i];
        }
        return tab3;
    }
}


/*Merge tablicy**
        - Napisz metodę `merge(int[] tab1, int[] tab2)`, która zwraca nową tablicę z elementami obu tablic.
        - W `main` wypisz zmergowana tablicę.*/
