package task9;

import java.util.Optional;

public class Method {
    static String describeGrade(Optional<Integer> grade){
        return grade.filter(g -> g >= 4)
                .map(g -> "Dobra ocena: <" + g + ">").orElse("Missed");
    }
}
