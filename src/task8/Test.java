package task8;

import java.util.Optional;

import static task8.Method.getUserEmail;

public class Test {
    public static void main(String[] args) {
        User ala = new User("Ala", "ala@mail.com");
        User bob = new User("Bob", null);
        Optional.empty();

        String userEmail = getUserEmail(Optional.of(ala));
        System.out.println(userEmail);
        String userEmail1 = getUserEmail(Optional.of(bob));
        System.out.println(userEmail1);
        String userEmail2 = getUserEmail(Optional.empty());
        System.out.println(userEmail2);
    }
}