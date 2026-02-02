package app;

final class FFDateTime implements Comparable {
    private final int year;
    private final int month;
    private final int day;
    private final int hour;
    private final int minute;

    public FFDateTime(int year, int month, int day, int hour, int minute) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month must be 1-12");
        if (day < 1 || day > 30) throw new IllegalArgumentException("Day must be 1-30");
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("Hour must be 0-23");
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("Minute must be 0-59");
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
