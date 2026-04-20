package main.task9;

public class ResourceManager {
    private static final Object printerLock = new Object();
    private static final Object scannerLock = new Object();

    public static void main(String[] args) {
        Thread worker1 = new Thread(() -> {
            System.out.println("Pracownik-1: próbuję zablokować drukarkę...");
            synchronized (printerLock) {
                System.out.println("Pracownik-1: mam drukarkę! Próbuję zablokować skaner...");
                sleep(100); // Daje czas drugiemu wątkowi
                synchronized (scannerLock) {
                    System.out.println("Pracownik-1: mam oba urządzenia! Drukuję i skanuję.");
                }
            }
        }, "Pracownik-1");

        Thread worker2 = new Thread(() -> {
            System.out.println("Pracownik-2: próbuję zablokować skaner...");
            synchronized (scannerLock) {
                System.out.println("Pracownik-2: mam skaner! Próbuję zablokować drukarkę...");
                sleep(100); // Daje czas pierwszemu wątkowi
                synchronized (printerLock) {
                    System.out.println("Pracownik-2: mam oba urządzenia! Skanuję i drukuję.");
                }
            }
        }, "Pracownik-2");

        worker1.start();
        worker2.start();

        System.out.println("[Main] Wątki uruchomione. Czekam na zakończenie...");

        // Program nigdy nie dojdzie tutaj -- deadlock!
        try {
            worker1.join(5000); // Czekaj max 5 sekund
            worker2.join(5000);
        } catch (InterruptedException e) {
        }

        if (worker1.isAlive() || worker2.isAlive()) {
            System.out.println("\n[Main] TIMEOUT! Wątki nadal działają -- prawdopodobnie deadlock!");
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
}
