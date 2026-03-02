package task10;

import java.util.Random;
import java.util.function.Supplier;

public class CodeGenerator {
    Supplier<String> codeSupplier = () -> {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(chars.charAt(random.nextInt(chars.length())));
        }
        return String.valueOf(stringBuilder);
    };
}
