class Person {
    private String name;
    private int age;

    static int numberOfPeople;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        numberOfPeople++;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public static void setNumberOfPeople(int numberOfPeople) {
        Person.numberOfPeople = numberOfPeople;
    }
    //    public Person(String name){
//        this.name = name;
//    }

    //14
//    public Person(String name) {
//        this(name, 0);
//    }

    //11
    public void introduceYourself() {
        System.out.println(name + " " + age);
    }

    //12
    public void introduceYourself(String greeting) {
        System.out.println(greeting + " " + name + " " + age);
    }

    //16
    public static void checkIfAdult(Person[] person) {
        for (Person person1 : person) {
            if (person1.age >= 18) {
                System.out.println(person1.name + ": Osoba jest dorosła");
            } else {
                System.out.println(person1.name + ": Osoba nie jest dorosła");
            }
        }
    }

    //17
    public int compareAge(Person other){
        return this.age - other.age;
    }
}
