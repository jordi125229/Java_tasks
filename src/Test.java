import com.sun.jdi.Value;

import java.util.Collection;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        TwoKeyMap<String, String, Integer> grades = trialMapCreate();
        entrySetTest(grades);
        testIfMapCanFindValueByKey(grades);
//        elementsRemovingTest(grades);
        testIfMapContainsKey(grades);
        testIfMapContainsValues(grades);
        mapSizeTest(grades);
        testIfMapIsEmpty(grades);
//        mapClearingTest(grades);
        keySetTest(grades);
        mapValuesMethodTest(grades);
        putAllTest(grades);
    }

    private static void entrySetTest(TwoKeyMap<String, String, Integer> grades) {
        Set<TwoKeyMap.Entry<String, String, Integer>> entries = grades.entrySet();
        System.out.println("Entries test: ");
        System.out.println(entries + "\n");
    }

    private static void mapValuesMethodTest(TwoKeyMap<String, String, Integer> grades) {
        Collection<Integer> values = grades.values();
        System.out.println("Getting values test: ");
        System.out.println(values);
    }

    private static void mapClearingTest(TwoKeyMap<String, String, Integer> grades) {
        grades.clear();
        printMap(grades);
    }

    private static void elementsRemovingTest(TwoKeyMap<String, String, Integer> grades) {
        grades.remove("Alice", "Math");
        printMap(grades);
    }

    private static void testIfMapIsEmpty(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Test if map is empty: ");
        System.out.println(grades.isEmpty() + "\n");
    }

    private static void mapSizeTest(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Map's size test: ");
        System.out.println(grades.size() + "\n");
    }

    private static void testIfMapCanFindValueByKey(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Finding value by key test: ");
        Integer valueFoundByKey = grades.get("Alice", "Math");
        System.out.println(valueFoundByKey + "\n");
    }

    private static TwoKeyMap<String, String, Integer> trialMapCreate() {
        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();
        System.out.println("Trial map creating: ");
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        printMap(grades);
        System.out.println();
        return grades;
    }

    private static void putAllTest(TwoKeyMap<String, String, Integer> grades) {
        TwoKeyMap<String, String, Integer> trialMap = new NestedTwoKeyHashMap<>();
        trialMap.put("key1", "key2", 4);
        grades.putAll(trialMap);
        printMap(grades);
    }

    private static void keySetTest(TwoKeyMap<String, String, Integer> grades) {
        Set<Pair<String, String>> pairs = grades.keySet();
        System.out.println("Setting keys test: ");
        System.out.println(pairs + "\n");
    }

    private static void testIfMapContainsValues(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Test if map contains values: ");
        System.out.println(grades.containsValue(4));
        System.out.println(grades.containsValue(3) + "\n");
    }

    private static void testIfMapContainsKey(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Test if map contains keys: ");
        System.out.println(grades.containsKeys("Alice", "Math") + "\n");
    }

    private static void printMap(TwoKeyMap<String, String, Integer> grades) {
        System.out.println(grades);
    }
}
