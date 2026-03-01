package task7;

import java.util.function.BiPredicate;

public class BiPredicates {
    BiPredicate<String, String> sameIgnoreCase = (s1, s2) -> {
        if (s1.equalsIgnoreCase(s2)) {
            return true;
        } else {
            return false;
        }
    };

    BiPredicate<String, String> isSuffix = (s1, s2) -> {
        if (s1.endsWith(s2)) {
            return true;
        } else {
            return false;
        }
    };
}