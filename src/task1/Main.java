package task1;

public class Main {
    public static void main(String[] args) {
        correctPasswordTest();
        passwordSpecialDigitTest();
        passwordLengthValidationTest();
    }

    private static void correctPasswordTest() {
        User user1 = new User("superkomputer@1");
        System.out.println(PasswordValidator.validate(user1));
    }

    private static void passwordSpecialDigitTest() {
        User user2 = new User("superkomputer10");
        System.out.println(PasswordValidator.validate(user2));
    }

    private static void passwordLengthValidationTest() {
        User user3 = new User("suer@10");
        System.out.println(PasswordValidator.validate(user3));
    }
}
