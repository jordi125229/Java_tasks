package task5;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperationClass {
    UnaryOperator<List<Integer>> removeNegatives = list -> {
        list.removeIf(n -> n < 0);
        return list;
    };

    BinaryOperator<Integer> maxOp = (a, b) -> {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    };
}