package task1;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> test1 = Optional.of("test");
        Optional<String> test2 = Optional.ofNullable("test");
        Optional<String> test3 = Optional.empty();

        boolean test1IsPresent = test1.isPresent();
        boolean test1IsEmpty = test1.isEmpty();
        System.out.println("opt1: present=" + test1IsPresent + ", empty=" + test1IsEmpty);

        boolean test2IsPresent = test2.isPresent();
        boolean test2IsEmpty = test2.isEmpty();
        System.out.println("opt1: present=" + test2IsPresent + ", empty=" + test2IsEmpty);

        boolean test3IsPresent = test3.isPresent();
        boolean test3IsEmpty = test3.isEmpty();
        System.out.println("opt1: present=" + test3IsPresent + ", empty=" + test3IsEmpty);

//        Optional.of(null); //NullPointerException
        Optional.ofNullable(null); //tworzy sie Optional
    }
}
