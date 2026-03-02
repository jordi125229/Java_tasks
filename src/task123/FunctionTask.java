package task123;

import java.util.function.Function;

public class FunctionTask {
    Function<String[], String[]> normalizeLogin = s -> {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].trim().toLowerCase();
        }
        return s;
    };

    Function<String[], String[]> replacingSigns = s -> {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replaceAll("\\s+", "");
        }
        return s;
    };

    Function<String[], String[]> combinedFunctions = normalizeLogin.andThen(replacingSigns);
}