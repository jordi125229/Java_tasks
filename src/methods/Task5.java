package methods;

class Task5 {
    public static void main(String[] args) {
        double average = srednia(2, 5, 9);
        System.out.printf("%.2f%n", average); //uzylem AI, nie wiedzialem jak to wypisac
    }

    static double srednia(double a, double b, double c){
        return (a + b + c)/3;
    }
}
