package Loops;

import java.util.Scanner;

class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "Course";
        String password = "Java";

        for (int i = 0; i <= 2; i++) {
            System.out.println("Provide login and password ");
            String l = sc.nextLine();
            String p = sc.nextLine();

            if (l.equals(login) && p.equals(password)) {
                System.out.println("Logged in correctly");
                break;
            }
            if (i >= 2) {
                System.out.println("Account blocked");
            }
        }
    }
}
