package methods;

class Task5 {
    public static void main(String[] args) {
        double average = average(2, 5, 9);
        System.out.printf("%.2f%n", average); //uzylem AI, nie wiedzialem jak to wypisac
    }

    static double average(double a, double b, double c){
        return (a + b + c)/3;
    }
}
