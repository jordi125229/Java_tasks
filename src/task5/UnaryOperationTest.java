package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnaryOperationTest {
    public static void main(String[] args) {
        UnaryOperationClass test = new UnaryOperationClass();
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -1, 7, -5, 10, 0));
        List<Integer> afterRemovingNeg = test.removeNegatives.apply(nums);
        System.out.println(afterRemovingNeg);

        getingMaxValueFromList(afterRemovingNeg, test);
    }

    private static void getingMaxValueFromList(List<Integer> afterRemovingNeg, UnaryOperationClass test) {
        int max = afterRemovingNeg.get(0);
        for (int i = 0; i < afterRemovingNeg.size(); i++) {
            max = test.maxOp.apply(max, afterRemovingNeg.get(i));
        }
        System.out.println(max);
    }
}
