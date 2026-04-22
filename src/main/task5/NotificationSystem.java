package main.task5;

public class NotificationSystem {
    interface NotificationSender {
        void send(String recipient, String message);  // METHOD BREAKPOINT na tej linii
    }

    static class EmailSender implements NotificationSender {
        private final NotificationManager manager;

        EmailSender(NotificationManager manager) {
            this.manager = manager;
        }

        @Override
        public void send(String recipient, String message) {
            System.out.println("[EMAIL] Do: " + recipient + " → " + message);
            manager.incrementSentCount();
        }
    }

    static class SmsSender implements NotificationSender {
        private final NotificationManager manager;

        SmsSender(NotificationManager manager) {
            this.manager = manager;
        }

        @Override
        public void send(String recipient, String message) {
            System.out.println("[SMS] Do: " + recipient + " → " + message);
            // BUG: brakuje manager.incrementSentCount()!
        }
    }

    static class PushSender implements NotificationSender {
        private final NotificationManager manager;

        PushSender(NotificationManager manager) {
            this.manager = manager;
        }

        @Override
        public void send(String recipient, String message) {
            System.out.println("[PUSH] Do: " + recipient + " → " + message);
            manager.incrementSentCount();
        }
    }

    static class NotificationManager {
        private int sentCount = 0;   // FIELD WATCHPOINT na to pole

        void incrementSentCount() {
            sentCount++;
        }

        int getSentCount() {
            return sentCount;
        }
    }

    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();

        NotificationSender email = new EmailSender(manager);
        NotificationSender sms = new SmsSender(manager);
        NotificationSender push = new PushSender(manager);

        // Wysyłamy 7 powiadomień
        email.send("jan@example.com", "Twoje zamówienie zostało wysłane");
        sms.send("+48123456789", "Kod weryfikacyjny: 4821");
        push.send("user_anna", "Nowa wiadomość od Bartka");
        email.send("anna@example.com", "Faktura FV-001 do pobrania");
        sms.send("+48987654321", "Twoja paczka czeka w paczkomacie");
        push.send("user_piotr", "Przypomnienie: spotkanie o 15:00");
        email.send("piotr@example.com", "Potwierdzenie rezerwacji");

        System.out.println("\n=== Raport ===");
        System.out.println("Wysłano powiadomień: " + manager.getSentCount());
        System.out.println("Oczekiwano: 7");
        System.out.println(manager.getSentCount() == 7 ? "OK" : "BŁĄD - licznik się nie zgadza!");
    }
}
