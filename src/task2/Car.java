package task2;

public class Car extends Vehicle {

    @Override
    String description() {
        return "This is a car";
    }

    @Deprecated(since = "1.0", forRemoval = true)
    @Override
    void oldMethod() {
        super.oldMethod();
    }

    void newMethod() {
        System.out.println("New method");
    }
}
