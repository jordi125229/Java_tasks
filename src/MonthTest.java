import java.time.MonthDay;

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
    }
}
