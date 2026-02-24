package task5;

import java.util.ArrayList;
import java.util.List;

import static task5.LongestWord.getLongestWord;

class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("sun", "moon", "earth", "water"));
        String theLongestWord = getLongestWord(list);
        System.out.println(theLongestWord);
    }
}
