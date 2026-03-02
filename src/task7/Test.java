package task7;

import java.util.Optional;

import static task7.Method.extractLogin;

public class Test {
    public static void main(String[] args) {
        Optional<String> test1 = extractLogin(Optional.of("jan.kowalski@example.com"));
        Optional<String> test2 = extractLogin(Optional.empty());

        System.out.println(test1);
        System.out.println(test2);
    }
}
