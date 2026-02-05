package person;

import days.DayOfWeek;

class PersonTest {
    public static void main(String[] args) {
        //Task10
        Person person1 = new Person("Piotr", DayOfWeek.SUNDAY);
        Person person2 = new Person("Kuba", DayOfWeek.MONDAY);
        Person person3 = new Person("Rafal", DayOfWeek.WEDNESDAY);

        person1.showDayOff();
        person2.showDayOff();
        person3.showDayOff();
    }
}
