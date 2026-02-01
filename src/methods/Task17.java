package methods;

class Task17 {
    public static void main(String[] args) {
        System.out.println(nwdIter(17, 31));
        System.out.println(nwdIter(24, 18));
        System.out.println(nwdIter(35, 14));
        System.out.println(nwdIter(5, 15));

    }

    static int nwdIter(int a, int b) {
        while (b != 0) {
            int i1 = a % b;
            a = b;
            b = i1;
        }
        return a;
    }
}