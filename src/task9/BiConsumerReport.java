package task9;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerReport {
    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        map.forEach(consumer);
    }

    BiConsumer<String, Integer> reporter = (s, i) -> {
        System.out.println("Product: <" + s + ">, quantity: <" + i + ">");
    };
}
