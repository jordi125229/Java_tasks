package task11;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        printUserWithoutExceptions(userRepository, 1);
        printUserWithoutExceptions(userRepository, 3);
        printUserWithoutExceptions(userRepository, 2);
        printUserWithoutExceptions(userRepository, 99);
    }

    private static void printUserWithoutExceptions(UserRepository userRepository, int id) {
        try {
            String byId = getAdultNameById(userRepository, id);
            System.out.println(byId);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    static String getAdultNameById(UserRepository repo, int id){
        return repo.findById(id).filter(user -> user.getAge() >= 18).map(user -> user.getName().toUpperCase())
                .orElseThrow(() -> new IllegalArgumentException("User wasn't find"));
    }
}
