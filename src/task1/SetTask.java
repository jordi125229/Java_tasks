package task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SetTask {
    public static Set<String> sameWords(List<String> list1, List<String> list2) {
        Set<String> all = new HashSet<>(list1);
        all.retainAll(list2);
        return all;
    }
}
