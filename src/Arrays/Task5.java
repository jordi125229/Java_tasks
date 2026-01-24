package Arrays;

class Task5 {
    public static void main(String[] args) {
        double[] array = new double[]{1, 5, 3, 7, 11, 9, 12};
        Task5 test = new Task5();

        double multipliedArray = test.multiplication(array);
        System.out.println(multipliedArray);
    }

    double multiplication(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/ array.length;
    }
}
