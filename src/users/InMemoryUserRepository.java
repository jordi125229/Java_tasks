package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryUserRepository implements UserRepository {
    List<User> users = new ArrayList<>();

    @Override
    public void add(User u) {
        users.add(u);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
