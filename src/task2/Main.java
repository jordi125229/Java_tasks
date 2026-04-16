package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        String description1 = car.description();
        System.out.println(description1);
        car.newMethod();

        vehicle.oldMethod();
        String description = vehicle.description();
        System.out.println(description);

        Calculation calculation = (Integer::sum);
        int result = calculation.execute(5, 6);
        System.out.println(result);
    }
}
