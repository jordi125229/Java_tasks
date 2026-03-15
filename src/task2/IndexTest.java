package task2;

import static task2.ArrayUtils.indexOf;
import static task2.ArrayUtils.lastIndexOf;

class IndexTest {
    public static void main(String[] args) {
        String[] s = new String[]{null, "a", null, "b", "a"};
        String[] nullArray = null;

        int index = indexOf(s, null);
        System.out.println(index);

        int indexForNull = lastIndexOf(s, null);
        System.out.println(indexForNull);

        int indexForA = indexOf(s, "a");
        System.out.println(indexForA);

        int lastForA = lastIndexOf(s, "a");
        System.out.println(lastForA);

        int indexNoExisting = indexOf(s, "zzz");
        System.out.println(indexNoExisting);

        indexOf(nullArray, null);
    }
}
