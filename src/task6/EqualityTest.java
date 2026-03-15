package task6;

class EqualityTest {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> t1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t3 = Triple.of("id", 43, true);

        boolean firstComparision = t1.equals(t2);
        System.out.println(firstComparision);

        boolean secondComparision = t1.equals(t3);
        System.out.println(secondComparision);
    }
}
