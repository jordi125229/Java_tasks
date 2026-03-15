package task4;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int first = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert second number: ");
        int second = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert sign: `+`, `-`, `*`, `/` ");
        String sign = scanner.nextLine();
        BiFunction<Integer, Integer, Integer> operation;

        operation = getIntegerIntegerIntegerBiFunction(sign, calculator);

        int result = calculator.calculate(first, second, operation);
        System.out.println("Result = " + result);
    }

    private static BiFunction<Integer, Integer, Integer> getIntegerIntegerIntegerBiFunction(String sign, Calculator calculator) {
        BiFunction<Integer, Integer, Integer> operation;
        switch (sign) {
            case "+" -> operation = calculator.add;
            case "-" -> operation = calculator.sub;
            case "*" -> operation = calculator.mul;
            case "/" -> operation = calculator.div;
            default -> throw new IllegalArgumentException();
        }
        return operation;
    }
}
