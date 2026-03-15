package task1;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");

        testingOfPairMatching(p1, p2);
        testingOfPairMatching(p1, p3);

        int p1HashCode = p1.hashCode();
        int p2HashCode = p2.hashCode();
        checkIfHashCodeAreEquals(p1HashCode, p2HashCode);
    }

    private static void checkIfHashCodeAreEquals(int p1HashCode, int p2HashCode) {
        if (p1HashCode == p2HashCode) {
            System.out.println("P1 Hash code = P2 Hash Code");
        } else {
            System.out.println("P1 Hash code != P2 Hash Code");
        }
    }

    private static void testingOfPairMatching(Pair<Integer, String> p1, Pair<Integer, String> p2) {
        boolean equals = p1.equals(p2);
        System.out.println(equals);
    }
}
