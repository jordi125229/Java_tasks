package task4;

import task1.Pair;
import static task4.MinMax.minMax;
import static task4.MinMax.printPair;

class MinMaxTest {
    public static void main(String[] args) {
        String[] s = new String[]{"aa", "b", "ccc"};
        Pair<String, String> stringPair = minMax(s);
        printPair(stringPair);

        Integer[] i = new Integer[]{5, 5, -1, 10, 10};
        Pair<Integer, Integer> integerPair = minMax(i);
        printPair(integerPair);

        Integer[] x = new Integer[]{42};
        Pair<Integer, Integer> oneInteger = minMax(x);
        printPair(oneInteger);

        Integer[] arr = new Integer[]{1, null, 2};
        minMax(arr);
    }
}
