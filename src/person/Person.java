package person;

import days.DayOfWeek;

class Person {
    String name;
    DayOfWeek dayOff;

    public Person(String name, DayOfWeek dayOff) {
        this.name = name;
        this.dayOff = dayOff;
    }

    public void showDayOff(){
        System.out.println(dayOff);
    }
}
