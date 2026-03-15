package task6;

public class PredicateTest {
    public static void main(String[] args) {
        PredicateInterface predicateInterface = new PredicateInterface();
        String[] logins = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};
        checkingLogginsCorrection(logins, predicateInterface);
    }

    private static void checkingLogginsCorrection(String[] loginy, PredicateInterface predicateInterface) {
        int correctLogins = 0;
        for (int i = 0; i < loginy.length; i++) {
            boolean test = predicateInterface.isValidLogin.test(loginy[i]);
            if (test == true) {
                System.out.println(loginy[i]);
                correctLogins++;
            }
        }
        System.out.println(correctLogins);
    }
}
