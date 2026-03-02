package task9;

import java.util.List;
import java.util.Optional;

import static task9.Method.describeGrade;

public class Test {
    public static void main(String[] args) {
        List<Optional<Integer>> notes = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5));

        for (Optional<Integer> note : notes) {
            String s = describeGrade(note);
            System.out.println(s);
        }
    }
}
