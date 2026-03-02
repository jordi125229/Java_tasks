package task10;

public class Test {
    public static void main(String[] args) {
        CodeGenerator codeGenerator = new CodeGenerator();
        String[] codes = new String[10];
        codesGeneratorForArray(codes, codeGenerator);
        print(codes);
    }

    private static void codesGeneratorForArray(String[] codes, CodeGenerator codeGenerator) {
        for (int i = 0; i < codes.length; i++) {
            codes[i] = codeGenerator.codeSupplier.get();
        }
    }

    static<T> void print(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }
}
