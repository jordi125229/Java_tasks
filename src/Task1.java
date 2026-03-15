import java.math.BigDecimal;

class Task1 {
    public static void main(String[] args) {
        BigDecimal test = new BigDecimal("10.5");
        System.out.println(test);

        BigDecimal test2 = new BigDecimal("2.25");

        //adding
        BigDecimal add = test.add(test2);
        System.out.println(add);

        //subtracting
        BigDecimal subtract = test.subtract(test2);
        System.out.println(subtract);

        //multiplying
        BigDecimal multiply = test.multiply(test2);
        System.out.println(multiply);

        //dividing
        BigDecimal divide = test.divide(test2);
        System.out.println(divide);
    }
}
