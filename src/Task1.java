import java.math.BigDecimal;

class Task1 {
    public static void main(String[] args) {
        BigDecimal test = new BigDecimal("10.5");
        System.out.println(test);

        BigDecimal test2 = new BigDecimal("2.25");

        //dodawanie
        BigDecimal add = test.add(test2);
        System.out.println(add);

        //odejmowanie
        BigDecimal subtract = test.subtract(test2);
        System.out.println(subtract);

        //mnozenie
        BigDecimal multiply = test.multiply(test2);
        System.out.println(multiply);

        //dzielenie
        BigDecimal divide = test.divide(test2);
        System.out.println(divide);
    }
}
