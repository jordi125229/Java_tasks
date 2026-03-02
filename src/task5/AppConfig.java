package task5;

import java.util.Map;
import java.util.Optional;

public class AppConfig {
    static String getRequired(String key) {
        Map<String, String> config = Map.of(
                "db.url", "jdbc:mysql://localhost:3306/app",
                "db.user", "admin");
        return Optional.ofNullable(config.get(key)).orElseThrow(() -> new IllegalArgumentException(key));
    }

    public static void main(String[] args) {
        try {
            String required = getRequired("db.url");
            System.out.println(required);
            getRequired("db.password");
        } catch (IllegalArgumentException e) {
            System.out.println("Can't find value");
        }
    }
}
