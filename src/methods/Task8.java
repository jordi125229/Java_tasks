package methods;

class Task8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int i1 = factorialIter(3);
        int i2 = factorialIter(4);
        int i3 = factorialIter(5);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    public static int factorialIter(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
