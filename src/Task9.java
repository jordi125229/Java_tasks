import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int result;
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(result);
        }
    }
}
