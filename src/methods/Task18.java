package methods;

class Task18 {
    public static void main(String[] args) {
        System.out.println(nwdRek(17,31));
        System.out.println(nwdRek(24,18));
        System.out.println(nwdRek(35,14));
        System.out.println(nwdRek(5,15));

    }

    static int nwdRek(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return nwdRek(b, a % b);
        }
    }
}


/*NWD dwóch liczb – rekurencyjnie**
        - Napisz metodę `nwdRek(int a, int b)`, która zwraca NWD obliczony rekurencyjnie metodą Euklidesa.*/