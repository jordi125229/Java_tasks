package days;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static boolean isWeekend(DayOfWeek weekDay) {
        if (weekDay == SATURDAY || weekDay == SUNDAY) {
            return true;
        }
        return false;
    }
}

