package task2;

import java.util.List;

import static task2.Method.ifHasDoubled;

class Test {
    public static void main(String[] args) {
        List<String> list = List.of("sun", "moon", "earth", "water", "sun");
        List<String> list2 = List.of("sun", "moon", "earth", "water");

        boolean firstCheck = ifHasDoubled(list);
        boolean secondCheck = ifHasDoubled(list2);
        System.out.println(firstCheck);
        System.out.println(secondCheck);
    }
}
