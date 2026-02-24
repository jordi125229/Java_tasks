package task3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class EmailReduction {
    public static int emailReduction(List<String> emails) {
        Set<String> emailSet = new TreeSet<>(emails);
        System.out.println(emailSet);
        return emailSet.size();
    }
}
