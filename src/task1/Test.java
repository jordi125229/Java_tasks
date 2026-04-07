package task1;

public class Test {

    public static void main(String[] args) {
        MyThread myThread = new MyThread(1);
        MyThread myThread1 = new MyThread(2);
        MyThread myThread2 = new MyThread(3);
        MyThread myThread3 = new MyThread(4);
        MyThread myThread4 = new MyThread(5);

        try {
            myThread.start();
            myThread1.start();
            myThread2.start();
            myThread3.start();
            myThread4.start();
            myThread.join();
            myThread1.join();
            myThread2.join();
            myThread3.join();
            myThread4.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All threads are finished");
        System.out.println(MyThread.counter);
    }
}
