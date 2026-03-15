package task4;

import java.util.function.BiFunction;

public class Calculator {
    BiFunction<Integer, Integer, Integer> add = ((integer, integer2) -> integer + integer2);
    BiFunction<Integer, Integer, Integer> sub = ((integer, integer2) -> integer - integer2);
    BiFunction<Integer, Integer, Integer> mul = ((integer, integer2) -> integer * integer2);
    BiFunction<Integer, Integer, Integer> div = ((integer, integer2) -> {
        if (integer2 == 0) {
            throw new ArithmeticException("Can't divide by '0'");
        }
        return integer / integer2;
    });

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }
}
