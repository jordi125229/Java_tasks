package methods;

import java.util.Scanner;

class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose option:");
            menu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    printNumbers();
                    print(add(sc.nextInt(), sc.nextInt()));
                    break;
                case 2:
                    printNumbers();
                    print(subtract(sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    printNumbers();
                    print(multiply(sc.nextInt(), sc.nextInt()));
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong option");
            }
        } while (option != 0);
    }

    static void menu() {
        System.out.println("1 – Add");
        System.out.println("2 – Subtract");
        System.out.println("3 – Multiply");
        System.out.println("0 – Exit");
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static void print(double i) {
        System.out.println(i);
    }

    static void printNumbers() {
        System.out.println("Insert numbers to operation");
    }
}
