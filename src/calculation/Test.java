package calculation;

class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int calculate = Calculation.ADD.calculate(a, b);
        int calculate1 = Calculation.SUBTRACT.calculate(a, b);
        int calculate2 = Calculation.MULTIPLY.calculate(a, b);
        int calculate3 = Calculation.DIVIDE.calculate(a, b);

        System.out.println(calculate);
        System.out.println(calculate1);
        System.out.println(calculate2);
        System.out.println(calculate3);
    }
}
