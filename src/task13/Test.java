package task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ComparatorInterface comparatorInterface = new ComparatorInterface();
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("tv", 2500.0, 3),
                new Product("keyboard", 80, 5),
                new Product("screen", 500, 4),
                new Product("computer", 2500, 1)));

        System.out.println(products);
        products.sort(comparatorInterface.multiSort);
        System.out.println(products);
    }
}
