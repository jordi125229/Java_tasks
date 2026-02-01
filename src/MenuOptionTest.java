import java.util.Scanner;

class MenuOptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option: START, STOP and EXIT");
        String s = sc.nextLine().toUpperCase();

        MenuOption option;
        option = MenuOption.valueOf(s);

        switch (option) {
            case START -> System.out.println("Start");
            case STOP -> System.out.println("Stop");
            case EXIT -> System.out.println("Ending");
        }
    }
}
