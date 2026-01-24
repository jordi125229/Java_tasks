package Loops;

import java.util.Scanner;

class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "Kurs";
        String password = "Java";

        for (int i = 0; i <= 2; i++) {
            System.out.println("Podaj login i hasło");
            String l = sc.nextLine();
            String p = sc.nextLine();

            if (l.equals(login) && p.equals(password)) {
                break;
            }
            if (i >= 2) {
                System.out.println("Konto zablokowane");
            } else {
                System.out.println("Zalogowano pomyślnie");
            }
        }
    }
}
