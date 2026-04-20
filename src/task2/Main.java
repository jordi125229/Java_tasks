package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        firstCarDescriptionTest(car);
        oldMethodTest(vehicle);
        calculatingInterfaceTest();
    }

    private static void firstCarDescriptionTest(Car car) {
        String description1 = car.description();
        System.out.println(description1);
        car.newMethod();
    }

    private static void oldMethodTest(Vehicle vehicle) {
        vehicle.oldMethod();
        String description = vehicle.description();
        System.out.println(description);
    }

    private static void calculatingInterfaceTest() {
        Calculation calculation = (Integer::sum);
        int result = calculation.execute(5, 6);
        System.out.println(result);
    }
}
