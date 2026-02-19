package task4;

import task1.Pair;

public final class MinMax {
    private MinMax() {
    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array can't be empty");
        }
        T max = arr[0];
        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalArgumentException("Array's element can't be null");
            }
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return Pair.of(min, max);
    }

    public static <T> void printPair(Pair<T, T> pair) {
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
    }
}
