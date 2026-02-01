class TestExample {
    public static void main(String[] args) {
        Example e1 = Example.EXAMPLE1;
        Example e2 = Example.EXAMPLE1;

        System.out.println(e1.equals(e2));
        System.out.println(e1 == e2);
    }
}
