package task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Method {
    public static boolean ifHasDoubled(List<String> list) {
        Set<String> set = new HashSet<>(list);
        if (set.size() < list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
