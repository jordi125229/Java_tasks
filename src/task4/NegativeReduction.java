package task4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NegativeReduction {
    public static List<Integer> deleteNegativeAndSort(List<Integer> list) {
        list.removeIf(n -> n < 0);
        Collections.sort(list);
        return list;
    }

    public static List<Integer> reverseList(List<Integer> list) {
        return list.reversed();
    }
}
