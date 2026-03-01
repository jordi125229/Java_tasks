package task14;

import static task14.Main.calculatePrice;

public class Test {
    public static void main(String[] args) {
        Main test = new Main();
        double price1 = 100;
        double price2 = 250;
        double price3 = 399;

        System.out.println(calculatePrice(price1, test.blackFriday));
        System.out.println(calculatePrice(price1, test.normal));
        System.out.println(calculatePrice(price1, test.student));
        System.out.println(calculatePrice(price1, test.vip));
        System.out.println(calculatePrice(price2, test.blackFriday));
        System.out.println(calculatePrice(price2, test.normal));
        System.out.println(calculatePrice(price3, test.normal));
        System.out.println(calculatePrice(price3, test.vip));
    }
}
