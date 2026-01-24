package methods;

class Task12 {
    public static void main(String[] args) {
        int n = 9;
        boolean result = czyPierwsza(n);

        if (result == true) {
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }
    }

    static boolean czyPierwsza(int n){

        return false;
    }
}


/*Czy liczba jest pierwsza**
        - Napisz metodę `czyPierwsza(int n)`, która zwraca `true` jeśli liczba jest pierwsza.
        - W `main` wypisz odpowiedni komunikat w zależności od wyniku.*/