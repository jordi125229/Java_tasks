package months;

class MonthTest {
    public static void main(String[] args) {

        //Task6
        for (Month value : Month.values()) {
            System.out.println(value + " " + value.days);
        }

        //Task7
        for (Month value : Month.values()) {
            System.out.println(value);
        }

        //Task8
        for (Month value : Month.values()) {
            System.out.println(value.name() +  ": " + value.ordinal());
        }

        Month month1 = Month.DECEMBER;
        Month month2 = Month.SEPTEMBER;
        int comparing = month1.compareTo(month2);
        System.out.println(comparing);

        //Task9
        for (Month value : Month.values()) {
            System.out.println(value);
        }

        //Task10
        Month[] months = new Month[]{Month.APRIL, Month.JULY, Month.SEPTEMBER, Month.NOVEMBER};
        int totalDays = 0;
        for (Month month : months) {
            System.out.println(month);
            totalDays += month.days;
        }
        System.out.println(totalDays);
    }
}
