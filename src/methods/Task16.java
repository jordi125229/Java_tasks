package methods;

class Task16 {
    public static void main(String[] args) {
        System.out.println(digitSumIter(32));
        System.out.println(digitSumIter(112));
        System.out.println(digitSumIter(-40));
        System.out.println(digitSumIter(771));
        System.out.println(digitSumIter(43));

        System.out.println(digitSumRek(32));
    }

    static int digitSumIter(int n) {
        int sum = 0;
        while (n != 0) {
            int x = n % 10;
            sum += x;
            n = n / 10;
        }
        return Math.abs(sum);
    }

    static int digitSumRek(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSumRek(n / 10);
    }
}
