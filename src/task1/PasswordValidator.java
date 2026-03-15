package task1;

public final class PasswordValidator {
    private PasswordValidator() {}

    public static void validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null!");
        }
        if (password.length() < 8){
            throw new IllegalArgumentException("Password can't be less than 8 chars!");
        }
        if (!password.matches(".*\\d.*")){ //copilot
            throw new IllegalArgumentException("Password must contain min one digit!");
        }
    }
}
