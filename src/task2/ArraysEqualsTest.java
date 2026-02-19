package task2;

import static task2.ArrayUtils.arraysEqual;

class ArraysEqualsTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, null, 3};
        Integer[] b = new Integer[]{1, null, 3};
        Integer[] c = new Integer[]{1, 2, 3};

        boolean firstCheck = arraysEqual(a, b);
        System.out.println(firstCheck);

        boolean secondCheck = arraysEqual(a, c);
        System.out.println(secondCheck);

        String[] firstArray = new String[]{"x"};
        String[] secondArray = null;
        boolean thirdCheck = arraysEqual(firstArray, secondArray);
        System.out.println(thirdCheck);

        boolean fourthCheck = arraysEqual(null, null);
        System.out.println(fourthCheck);
    }
}
