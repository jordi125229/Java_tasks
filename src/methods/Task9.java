package methods;

import static methods.Task8.silniaIter;

class Task9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int i1 = silniaIter(a);
        int i2 = silniaIter(b);
        int i3 = silniaIter(c);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = silniaRek(a);
        int i5 = silniaRek(b);
        int i6 = silniaRek(c);

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
    }

    public static int silniaRek(int num) {
        if (num > 1) {
            return num * silniaRek(num - 1);
        } else {
            return num;
        }
    }
}
//nie wiem jak to porównać