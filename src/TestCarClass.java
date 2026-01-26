class TestCarClass {
    public static void main(String[] args) {
        //Task 1
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.yearofProduction = 2024;
        System.out.println(car1);

        //Task2
        Car car2 = new Car();
        System.out.println(car2);

        //Task3
        Car car3 = new Car("Mercedes", 2021);
        Car car3i = new Car("Audi", 2019);
        Car car3x = new Car("Toyota", 2025);
        System.out.println(car3);
        System.out.println(car3i);
        System.out.println(car3x);

        //Task4
        car1.showDifference();

        //Task5
        car3.changeBrand("Volkswagen");
        System.out.println(car3);

        //Task6
        Car car6 = new Car();
        System.out.println(car6);

        //Task7
        car1.introduceYourself(car1);
        car3.introduceYourself(car3);
        car3i.introduceYourself(car3i);
        car3x.introduceYourself(car3x);

        //Task8
        Car.classDescription();

        //Task9
        System.out.println(Car.counter);

        //Task10
        Car[] carsArray = new Car[]{new Car("Skoda", 2014),
                new Car("Mazda", 2018),
                new Car("Subaru", 1995)};
        Car.printCarsArray(carsArray);
    }
}
