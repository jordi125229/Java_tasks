package task2;

import static task2.ArrayUtils.swap;
import static task2.SwapingTest.printArray;

class ExceptionTest {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 2, 3};
//        swap(nums, -1, 0);
        swap(nums, 0, 3);
    }
}
