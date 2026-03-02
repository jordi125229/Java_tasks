package task7;

import java.util.Optional;

public class Method {
    static Optional<String> extractLogin(Optional<String> email) {
        return email.map(e -> e.substring(0, e.indexOf("@")).toUpperCase());
    }
}