class Car {
    //1
    private String brand;
    private int yearofProduction;

    static int counter;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearofProduction() {
        return yearofProduction;
    }

    public void setYearofProduction(int yearofProduction) {
        this.yearofProduction = yearofProduction;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }

    //2
//    public Car() {
//        this.brand = "Unknown";
//        this.yearofProduction = 2000;
//    }
    //3 and 9
    public Car(String brand, int yearofProduction) {
        this.brand = brand;
        this.yearofProduction = yearofProduction;
        counter++;
    }

    //4
    public void showDifference() {
        String brand = "Opel";
        System.out.println(brand);
        System.out.println(this.brand);
    }

    //5
    public void changeBrand(String brand) {
        this.brand = brand;
    }

    //6
    public Car() {
        this("Unknown", 2000);
    }

    //7
    public void introduceYourself() {
        System.out.println("I am a car of brand " + brand + " from year " + yearofProduction);
    }

    //8
    public static void classDescription() {
        System.out.println("This class represents cars");
    }

    //10
    public static void printCarsArray(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return brand + "; " + yearofProduction;
    }
}
