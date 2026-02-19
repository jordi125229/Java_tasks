package task5;

final class CommandProcessor {
    static void processCommand(String cmd) throws IllegalArgumentException, IllegalStateException {
        if (cmd.equals("ARG")){
            throw new IllegalArgumentException();
        }
        if (cmd.equals("STATE")){
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
