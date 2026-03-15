package task6;

import java.util.function.Predicate;

public class PredicateInterface {
    Predicate<String> isValidLogin = login -> {
        if (login == null || login.length() < 3) {
            return false;
        }
        if (!Character.isLetter(login.charAt(0)))
            return false;
        for (char character : login.toCharArray()) {
            if (!Character.isLetterOrDigit(character) || character > 127) //AI
                return false;
        }
        return true;
    };
}
