package methods;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Task6 tester = new Task6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        double age = scanner.nextDouble();
        scanner.nextLine();

        String ageCategory = tester.kategoriaWiekowa(age);
        System.out.println(ageCategory);
    }
    String kategoriaWiekowa(double wiek){
        if (wiek < 12 && wiek >= 0) {
            return "Dziecko";
        } else if (wiek >= 12 && wiek < 18) {      // w poleceniu jest ze nastolatek (12-17) a pozniej dorosly od 18 w gore wiec pominiety jest okres 17-18, dlatego zalozylem ze ponizej 18 jest nastolatkiem
            return "Nastolatek";
        } else if (wiek >= 18 && wiek < 65){ // tu podobnie jak wyzej
            return "Dorosły";
        } else if (wiek >= 65) {
            return "Senior";
        } else {
            return "Błędny wiek";
        }
    }
}
