package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Test {
    public static void main(String[] args) {
        List<String> list1 = List.of("sun", "star", "moon");
        List<String> list2 = List.of("water", "star", "moon");

        Set<String> strings = SetTask.sameWords(list1, list2);
        System.out.println(strings);
    }
}
