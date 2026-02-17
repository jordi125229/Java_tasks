package task2;

public final class ArrayUtils {
    public ArrayUtils() {
    }

    public static <T> void swap(T[] arr, int i, int j) {
        if (i < 0 || j > 2) {
            throw new IndexOutOfBoundsException("Wrong index");
        } else if (i == j) {
            System.out.println("No changes");
        } else {
            T temporaryValue = arr[i];
            arr[i] = arr[j];
            arr[j] = temporaryValue;
        }
    }
}
