package task13;

import java.util.Comparator;

public class ComparatorInterface {
    Comparator<Product> multiSort = Comparator.comparingDouble((Product p) -> p.getPrice())
            .thenComparing(Comparator.comparingInt((Product p) -> p.getRating()).reversed());
}
