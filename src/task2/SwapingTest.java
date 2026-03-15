package task2;

import static task2.ArrayUtils.swap;

class SwapingTest {
    public static void main(String[] args) {
        String[] a = new String[]{"A", "B", "C"};
        System.out.println("Array before changes: ");
        printArray(a);
        swap(a, 0, 2);
        System.out.println("Array after changes: ");
        printArray(a);
    }

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }
}
