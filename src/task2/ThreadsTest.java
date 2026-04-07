package task2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsTest {
    public static void main(String[] args) {
        int arraySize = 1_000_000;
        int[] array = new int[arraySize];
        int k = 4;
        AtomicInteger sum = new AtomicInteger(0);
        arrayFillingAndSumCountingInOneThread(array);
        int partial = arraySize / k;
        counterBy4Threads(array, partial, sum, arraySize);
    }

    private static void counterBy4Threads(int[] array, int partial, AtomicInteger sum, int arraySize) {
        long start = System.nanoTime();
        try {
            Thread t1 = new MyThread(array, 0, partial, sum);
            Thread t2 = new MyThread(array, partial, partial * 2, sum);
            Thread t3 = new MyThread(array, partial * 2, partial * 3, sum);
            Thread t4 = new MyThread(array, partial * 3, arraySize, sum);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Result counted by threads: " + sum);
        System.out.println("Time: " + duration / 1_000_000);
    }

    private static void arrayFillingAndSumCountingInOneThread(int[] array) {
        long start = System.nanoTime();
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];
        }
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Result counted by loop: " + sum);
        System.out.println("Time: " + duration / 1_000_000);
    }
}

