package task8;

import java.util.List;

import static task8.Numbering.printWithNumbers;

public class NumberingTest {
    public static void main(String[] args) {
        Numbering numbering = new Numbering();
        List<String> list = List.of("string1", "string2", "string3");
        printWithNumbers(list, numbering.logger);
    }
}
