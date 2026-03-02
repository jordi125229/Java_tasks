package task10;

import java.util.Optional;
import java.util.function.Supplier;

public class Method {
    static Optional<String> findInCache(String key) {
        System.out.println("Finding in cache");
        if (key.equals("A")) {
            return Optional.of(key);
        } else {
            return Optional.empty();
        }
    }

    static Optional<String> findInDatabase(String key) {
        System.out.println("Finding in database");
        if (key.equals("B")) {
            return Optional.of(key);
        } else {
            return Optional.empty();
        }
    }

    static Optional<String> findDefault(String key) {
        System.out.println("Finding default");
        return Optional.of("Default");
    }

    static String findValue(String key) {
        return findInCache(key).or(() -> findInDatabase(key)).or(() -> findDefault(key)).get();
    }
}
