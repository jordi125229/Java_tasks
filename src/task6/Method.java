package task6;

import java.util.Optional;

public class Method {
    public static void presenceChecking(String[] nicks) {
        for (int i = 0; i < nicks.length; i++) {
            Optional.ofNullable(nicks[i]).ifPresent(nick -> System.out.println(nick));
        }
    }

    public static void presenceChecking2(String[] nicks) {
        for (int i = 0; i < nicks.length; i++) {
            Optional.ofNullable(nicks[i]).ifPresentOrElse(nick -> System.out.println(nick), () -> System.out.println("No nickname"));
        }
    }
}