package task2;

import static task2.ArrayUtils.swap;
import static task2.SwapingTest.printArray;

class NoChangesTest {
    public static void main(String[] args) {
        String[] x = new String[]{"X", "Y"};
        printArray(x);
        swap(x, 1, 1);
        printArray(x);
    }
}
