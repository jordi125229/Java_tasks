package task1;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private int threadNumber;
//    public static int counter = 0;
    public static AtomicInteger counter = new AtomicInteger(0);

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            counter++;
            counter.getAndIncrement();
            System.out.println("Thread " + threadNumber + " number: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
