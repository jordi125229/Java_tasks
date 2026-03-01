package task1;

import java.util.function.Function;

public class Report {
    Function<String, Integer> textLength = s -> s.replaceAll("\\s+", "").length();
    Function<String, Integer> letters = s -> {
        int vowelCount = 0;
        s.toLowerCase();
        for (char c : s.toCharArray()) {
            if ("aeiouy".indexOf(c) != -1) { //sprawdzilem w chacie
                vowelCount++;
            }
        }
        return vowelCount;
    };
}