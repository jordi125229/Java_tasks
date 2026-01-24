class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 3, 7, 11, 9, 12};
        Task4 test = new Task4();

        int summedArray = test.sum(array);
        System.out.println(summedArray);
    }

    int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
