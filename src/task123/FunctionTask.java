package task123;

import java.util.function.Function;

public class FunctionTask {
    Function<String[], String[]> normalizeLogin = s -> {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].trim().toLowerCase();
        }
        return s;
    };

    Function<String[], String[]> replacingSigns = string -> {
        for (int i = 0; i < string.length; i++) {
            string[i] = string[i].replaceAll("\\s+", "");
        }
        return string;
    };

    Function<String[], String[]> combinedFunctions = normalizeLogin.andThen(replacingSigns);
}