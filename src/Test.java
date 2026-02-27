import com.sun.jdi.Value;

import java.util.Collection;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        System.out.println(grades);
        Integer valueFoundByKey = grades.get("Alice", "Math");
        System.out.println(valueFoundByKey);
//        grades.remove("Alice", "Math");
//        System.out.println(grades);
        System.out.println(grades.containsKeys("Alice", "Math"));
        System.out.println(grades.containsValue(4));
        System.out.println(grades.containsValue(3));
        System.out.println(grades.size());
        System.out.println(grades.isEmpty());

//        grades.clear();
//        System.out.println(grades);

        Set<Pair<String, String>> pairs = grades.keySet();
        System.out.println(pairs);

        Collection<Integer> values = grades.values();
        System.out.println(values);

        TwoKeyMap<String, String, Integer> trialMap = new NestedTwoKeyHashMap<>();
        trialMap.put("key1", "key2", 4);
        grades.putAll(trialMap);
        System.out.println(grades);
    }
}
