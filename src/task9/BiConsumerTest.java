package task9;

import java.util.HashMap;
import java.util.Map;

import static task9.BiConsumerReport.printReport;

public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumerReport biConsumerReport = new BiConsumerReport();
        Map<String, Integer> productToQty = new HashMap<>();
        productToQty.put("milk", 3);
        productToQty.put("water", 10);
        productToQty.put("cookies", 5);

        printReport(productToQty, biConsumerReport.reporter);
    }
}
