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
                    if (password.length() < annotation.minLength()) {
                        return false;
                    }
                    if (annotation.requireDigit() && !password.matches(".*\\d.*")) {
                        return false;
                    }
                    if (annotation.requireSpecialChar()
                            && !password.matches(".*[^a-zA-Z0-9].*")) {
                        return false;
                    }
                    return true;
                }
            }
            return true;
        } catch (
                IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}