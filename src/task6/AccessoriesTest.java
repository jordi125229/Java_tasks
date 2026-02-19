package task6;

class AccessoriesTest {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> t = Triple.of("id", 42, true);
        String first = t.first();
        Integer second = t.second();
        Boolean third = t.third();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
