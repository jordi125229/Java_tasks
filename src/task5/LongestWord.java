package task5;

import java.util.Comparator;
import java.util.List;

class LongestWord {
    public static String getLongestWord(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        list.sort(Comparator.comparingInt(String::length));
        return list.getLast();
    }
}
