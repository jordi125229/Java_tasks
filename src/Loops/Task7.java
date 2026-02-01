package Loops;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "java123";
        String passwordProviding = null;

        while (!password.equals(passwordProviding)) {
            System.out.println("Podaj haslo");
            passwordProviding = sc.nextLine();
        }
        System.out.println("Super, udało sie");
    }
}
