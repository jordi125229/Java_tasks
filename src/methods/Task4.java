package methods;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task4 test = new Task4();
        int i = sc.nextInt();
        boolean b = test.ifEven(i);
        System.out.println(b);
    }

    boolean ifEven(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        }
        return false;
    }
}
