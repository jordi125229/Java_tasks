package methods;

class Task5 {
    public static void main(String[] args) {
        double avr = srednia(2, 5, 9);
        System.out.printf("%.2f%n", avr); //uzylem AI, nie wiedzialem jak to wypisac
    }

    static double srednia(double a, double b, double c){
        double average = (a + b + c)/3;
        return average;
    }
}
