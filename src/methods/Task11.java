package methods;

class Task11 {
    public static void main(String[] args) {
        Task11 test = new Task11();
        int[] array = new int[]{3, 61, 4, 9};
        int[] array1 = new int[]{50, 61, -2, 94, 2};
        int[] array2 = new int[]{-55, 24, 43, -44, 19};

        int arrayMax = test.maxArray(array);
        int arrayMax1 = test.maxArray(array1);
        int arrayMax2 = test.maxArray(array2);
        System.out.println(arrayMax);

        System.out.println(arrayMax1);
        System.out.println(arrayMax2);
    }

    int maxArray(int[] tab) {
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }
}
