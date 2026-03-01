package task8;

import java.util.List;
import java.util.function.Consumer;

public class Numbering {
    static void printWithNumbers(List<String> lines, Consumer<String> consumer) {
        for (int i = 0; i < lines.size(); i++) {
            consumer.accept(lines.get(i));
        }
    }

    Consumer<String> logger = s -> System.out.println("<" + s + ">");
}