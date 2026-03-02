package task11;

import java.util.List;
import java.util.Optional;

class UserRepository {

    private final List<User> users = List.of(
            new User(1, "Anna", 25),
            new User(2, "Bartek", 17),
            new User(3, "Celina", 30),
            new User(4, "Dawid", 15)
    );

    Optional<User> findById(int id) {
        for (User user : users) {
            if (user.getId() == id){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
