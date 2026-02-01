class CalculatorTest {
    public static void main(String[] args) {
        int calculate = Operation.ADD.calculate(5, 10);
        int calculate1 = Operation.SUBTRACT.calculate(5, 10);
        int calculate2 = Operation.MULTIPLY.calculate(5, 10);
        int calculate3 = Operation.DIVIDE.calculate(5, 10);

        System.out.println(calculate);
        System.out.println(calculate1);
        System.out.println(calculate2);
        System.out.println(calculate3);
    }
}
