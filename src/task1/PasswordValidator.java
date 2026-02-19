package task1;

public final class PasswordValidator {
    private PasswordValidator() {}

    public static void validate(String pwd) {
        if (pwd == null) {
            throw new IllegalArgumentException("Password can't be null!");
        }
        if (pwd.length() < 8){
            throw new IllegalArgumentException("Password can't be less than 8 chars!");
        }
        if (!pwd.matches(".*\\d.*")){ //copilot
            throw new IllegalArgumentException("Password must contain min one digit!");
        }
    }
}
