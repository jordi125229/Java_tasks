package task4;

import java.util.ArrayList;
import java.util.List;

import static task4.NegativeReduction.deleteNegativeAndSort;
import static task4.NegativeReduction.reverseList;

class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(-2, 75, -29, 100, 65, 43));
        deleteNegativeAndSort(numbers);
        System.out.println(numbers);

        List<Integer> numbers1 = reverseList(numbers);
        System.out.println(numbers1);
    }
}
