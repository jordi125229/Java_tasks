package methods;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Task6 tester = new Task6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert age");
        double age = scanner.nextDouble();
        scanner.nextLine();

        String ageCategory = tester.agecategory(age);
        System.out.println(ageCategory);

    }

    String agecategory(double age) {
        if (age < 12 && age >= 0) {
            return "Child";
        } else if (age >= 12 && age < 18) {      // w poleceniu jest ze nastolatek (12-17) a pozniej dorosly od 18 w gore wiec pominiety jest okres 17-18, dlatego zalozylem ze ponizej 18 jest nastolatkiem
            return "Teeneger";
        } else if (age >= 18 && age < 65) { // tu podobnie jak wyzej
            return "Adult";
        } else if (age >= 65) {
            return "Senior";
        } else {
            return "Wrong age";
        }
    }
}
