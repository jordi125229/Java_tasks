package task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("superkomputer@1");
        User user2 = new User("superkomputer10");
        User user3 = new User("suer10");

        System.out.println(PasswordValidator.validate(user1));
        System.out.println(PasswordValidator.validate(user2));
        System.out.println(PasswordValidator.validate(user3));
    }
}
