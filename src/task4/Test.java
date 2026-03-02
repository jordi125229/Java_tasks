package task4;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("value");
        Optional<String> empty = Optional.empty();

        System.out.println("OrElse: ");
        String s1 = value.orElse(generateDefault());
        String s2 = empty.orElse(generateDefault());
        System.out.println("OrElseGet: ");
        String s3 = value.orElseGet(() -> generateDefault()); //tu sie nie uruchomi, bo w Optionalu jest wartosc wiec nie wchodzimy do metody
        String s4 = empty.orElseGet(() -> generateDefault());
    }

    static String generateDefault() {
        System.out.println("  >> Generating default value...");
        return "DEFAULT";
    }
}
/*orElseGet wykona sie tylko gdy nic nie mamy w Optionalu, a orElse zawsze*/
