package task1;

import java.lang.reflect.Field;

public class PasswordValidator {
    public static boolean validate(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            for (Field declaredField : clazz.getDeclaredFields()) {
                if (declaredField.isAnnotationPresent(PasswordValidation.class)) {
                    declaredField.setAccessible(true);
                    Object object = declaredField.get(obj);
                    String password = (String) object;
                    PasswordValidation annotation = declaredField.getAnnotation(PasswordValidation.class);
                    if (passwordLenghtValidation(password, annotation)) return false;
                    if (passwordRequiredDigitsValidation(annotation, password)) return false;
                    if (passwordRequiredDigiValidation(annotation, password)) return false;
                    return true;
                }
            }
            return true;
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access to field");
            return false;
        }
    }

    private static boolean passwordRequiredDigiValidation(PasswordValidation annotation, String password) {
        if (annotation.requireSpecialChar()
                && !password.matches(".*[^a-zA-Z0-9].*")) {
            return true;
        }
        return false;
    }

    private static boolean passwordRequiredDigitsValidation(PasswordValidation annotation, String password) {
        if (annotation.requireDigit() && !password.matches(".*\\d.*")) {
            return true;
        }
        return false;
    }

    private static boolean passwordLenghtValidation(String password, PasswordValidation annotation) {
        if (password.length() < annotation.minLength()) {
            return true;
        }
        return false;
    }
}