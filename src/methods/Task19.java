package methods;

import java.util.Scanner;

class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Wybierz opcję:");
            menu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    printNumbers();
                    print(add(sc.nextInt(), sc.nextInt()));
                    break;
                case 2:
                    printNumbers();
                    print(reduct(sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    printNumbers();
                    print(multiply(sc.nextInt(), sc.nextInt()));
                    break;
                case 0:
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Błędny wydouble");
            }
        } while (option != 0);
    }

    static void menu() {
        System.out.println("1 – Dodawanie");
        System.out.println("2 – Odejmowanie");
        System.out.println("3 – Mnożenie");
        System.out.println("0 – Wyjście");
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double reduct(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static void print(double i) {
        System.out.println(i);
    }
    static void printNumbers(){
        System.out.println("Podaj liczby do działania");
    }
}
