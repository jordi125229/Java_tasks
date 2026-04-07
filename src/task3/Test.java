package task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) numbers.add(i);
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<BigInteger>> futures1 = new ArrayList<>();
        List<Future<BigInteger>> futures2 = new ArrayList<>();

        for (Integer number : numbers) {
            Callable<BigInteger> factorial = Method.getFactorial(number);
            Future<BigInteger> submission = pool.submit(factorial);
            futures1.add(submission);
        }

        for (Integer number : numbers) {
            Callable<BigInteger> multiplying = Method.getSquared(number);
            Future<BigInteger> submission = pool.submit(multiplying);
            futures2.add(submission);
        }

        for (int i = 0; i < futures2.size(); i++) {
            try {
                System.out.println(numbers.get(i) + " result -> " + futures2.get(i).get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < futures1.size(); i++) {
            try {
                System.out.println(numbers.get(i) + " result -> " + futures1.get(i).get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        pool.shutdown();
    }
}

