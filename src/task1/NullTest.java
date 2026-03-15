package task1;

class NullTest {
    public static void main(String[] args) {
        Pair<Object, String> p = Pair.of(null, "x");
        Object first = p.getFirst();
        System.out.println(first);
        System.out.println(p);
    }
}
