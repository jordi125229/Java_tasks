package days;

import java.util.Scanner;

class DayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task1
        DayOfWeek friday = DayOfWeek.FRIDAY;
        System.out.println("Day: " + friday);

        //Task2
//        for (days.DayOfWeek value : days.DayOfWeek.values()) {
//            System.out.println(value);
//        }

        //Task3
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.MONDAY;

        System.out.println(day1 == day2);

        //Task4
        DayOfWeek day = DayOfWeek.valueOf(sc.nextLine());
        switch (day) {
            case MONDAY -> System.out.println("Beginning of the week");
            case TUESDAY -> System.out.println("Beginning of the week");
            case WEDNESDAY -> System.out.println("Middle of the week");
            case THURSDAY -> System.out.println("Middle of the week");
            case FRIDAY -> System.out.println("Ending of the week");
            case SATURDAY -> System.out.println("Ending of the week");
            case SUNDAY -> System.out.println("Ending of the week");
        }

        //Task5
        boolean weekend = DayOfWeek.isWeekend(DayOfWeek.TUESDAY);
        boolean weekend1 = DayOfWeek.isWeekend(DayOfWeek.FRIDAY);
        boolean weekend2 = DayOfWeek.isWeekend(DayOfWeek.SATURDAY);
        System.out.println(weekend);
        System.out.println(weekend1);
        System.out.println(weekend2);
    }
}
