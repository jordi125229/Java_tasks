package task5;

final class CommandProcessor {
    static void processCommand(String command) {
        if (command.equals("ARG")) {
            throw new IllegalArgumentException();
        }
        if (command.equals("STATE")) {
            throw new IllegalStateException();
        }
    }

    static void demo() {
        try {
            processCommand("ARG");
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Wrong option");
        }
    }
}
