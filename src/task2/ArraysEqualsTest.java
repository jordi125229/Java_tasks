package task2;

import static task2.ArrayUtils.arraysEqual;

class ArraysEqualsTest {
    public static void main(String[] args) {
        Integer[] intArray1 = new Integer[]{1, null, 3};
        Integer[] intArray2 = new Integer[]{1, null, 3};
        Integer[] intArray3 = new Integer[]{1, 2, 3};

        boolean firstCheck = arraysEqual(intArray1, intArray2);
        System.out.println(firstCheck);

        boolean secondCheck = arraysEqual(intArray1, intArray3);
        System.out.println(secondCheck);

        String[] firstArray = new String[]{"x"};
        String[] secondArray = null;
        boolean thirdCheck = arraysEqual(firstArray, secondArray);
        System.out.println(thirdCheck);

        boolean fourthCheck = arraysEqual(null, null);
        System.out.println(fourthCheck);
    }
}
