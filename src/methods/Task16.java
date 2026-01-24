package methods;

class Task16 {
    public static void main(String[] args) {
        System.out.println(sumaCyfrIter(32));
        System.out.println(sumaCyfrIter(112));
        System.out.println(sumaCyfrIter(-40));
        System.out.println(sumaCyfrIter(771));
        System.out.println(sumaCyfrIter(43));

        System.out.println(sumaCyfrRek(32));
    }

    static int sumaCyfrIter(int n) {
        int sum = 0;
        while (n != 0) {
            int x = n % 10;
            sum += x;
            n = n / 10;
        }
        return Math.abs(sum);
    }

    static int sumaCyfrRek(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumaCyfrRek(n / 10);
    }
}
