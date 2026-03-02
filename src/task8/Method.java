package task8;

import java.util.Optional;

public class Method {
    static String getUserEmail(Optional<User> user){
        return user.flatMap(user1 -> user1.getEmail()).orElseGet(() -> "No email");
    }
}
