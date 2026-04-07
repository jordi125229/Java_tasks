package task2;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private int[] array;
    private int first;
    int last;
    private AtomicInteger totalSum;

    public MyThread(int[] array, int first, int last, AtomicInteger totalSum) {
        this.array = array;
        this.first = first;
        this.last = last;
        this.totalSum = totalSum;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = first; i < last; i++) {
            sum += array[i];
        }
        totalSum.addAndGet(sum);
    }
}
