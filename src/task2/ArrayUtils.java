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

    public static <T> int indexOf(T[] arr, T value) {
        if (arr == null) {
            throw new NullPointerException("Array can't be null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (value == null) {
                if (arr[i] == null) {
                    return i;
                }
            } else {
                if (value.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> int lastIndexOf(T[] arr, T value) {
        if (arr == null) {
            throw new NullPointerException("Array can't be null");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (value == null) {
                if (arr[i] == null) {
                    return i;
                }
            } else {
                if (value.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> boolean arraysEqual(T[] a, T[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] != null) {
                    return false;
                }
            } else {
                if (!a[i].equals(b[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
