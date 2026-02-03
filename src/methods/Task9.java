package methods;

import static methods.Task8.factorialIter;

class Task9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int i1 = factorialIter(a);
        int i2 = factorialIter(b);
        int i3 = factorialIter(c);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = factorialRek(a);
        int i5 = factorialRek(b);
        int i6 = factorialRek(c);

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
    }

    public static int factorialRek(int num) {
        if (num > 1) {
            return num * factorialRek(num - 1);
        } else {
            return num;
        }
    }
}
//nie wiem jak to porównać