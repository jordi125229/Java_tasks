package methods;

class Task10 {
    public static void main(String[] args) {
        Task10 test = new Task10();
        int[] array = new int[]{3,6,4,9};
        int arraySum = test.sumaTablicy(array);
        System.out.println(arraySum);
    }

    int sumaTablicy(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }
}


