package methods;

class Task12 {
    public static void main(String[] args) {
        int n = 3;
        boolean result = czyPierwsza(n);

        if (result) {
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }
    }

    static boolean czyPierwsza(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
