package task14;

public class Main {
    PriceStrategy normal = i -> i;
    PriceStrategy student = i -> 0.9 * i;
    PriceStrategy vip = i -> 0.8 * i;
    PriceStrategy blackFriday = i -> 0.7 * i;

    static double calculatePrice(double basePrice, PriceStrategy strategy){
        return strategy.apply(basePrice);
    }
}
