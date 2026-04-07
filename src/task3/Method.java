package task3;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class Method {
    public static Callable<BigInteger> getFactorial(Integer number) {
        Callable<BigInteger> factorial = () -> {
            Thread.sleep(500);
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        };
        return factorial;
    }

    public static Callable<BigInteger> getSquared(Integer number) {
        Callable<BigInteger> multiplying = () -> {
            Thread.sleep(500);
            return BigInteger.valueOf(number).multiply(BigInteger.valueOf(number));
        };
        return multiplying;
    }
}
