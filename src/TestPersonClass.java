class TestPersonClass {
    public static void main(String[] args) {

        //11
//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();

//        person1.name = "Kuba";
//        person1.age = 18;
//        person2.name = "Szymon";
//        person2.age = 24;
//        person3.name = "Olek";
//        person3.age = 35;
//
//        person1.introduceYourself();
//        person2.introduceYourself();
//        person3.introduceYourself();
//
//        //12
//        person1.introduceYourself("Hello");
//        person2.introduceYourself("Hi");
//        person3.introduceYourself("Bye");

//        //13
//        Person person4 = new Person("Bartek");
        Person person5 = new Person("Mateusz", 21);  //odkomentowalem zeby zrobic zadanie 15 i sprawdzic uzycie konstruktora
//        person4.introduceYourself();
//        person5.introduceYourself();

        //14
//        Person person6 = new Person("Daniel");
//        person6.introduceYourself();

        //15
        Person person7 = new Person("Kuba", 20);
        Person person8 = new Person("Szymon", 33);
        Person person9 = new Person("Olek", 15);
        System.out.println(Person.numberOfPeople);
        System.out.println(person7.numberOfPeople);

        //16
        Person[] peopleArray = new Person[]{
                new Person("Kuba", 20),
                new Person("Szymon", 33),
                new Person("Olek", 15)};

        Person.checkIfAdult(peopleArray);

        //17
        int compareAge = person7.compareAge(person8);
        System.out.println("Różnica wieku wynosi " + Math.abs(compareAge));


    }
}
