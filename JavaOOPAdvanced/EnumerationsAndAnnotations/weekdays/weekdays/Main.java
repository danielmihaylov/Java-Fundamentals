package JavaOOPAdvanced.EnumerationsAndAnnotations.weekdays.weekdays;

/**
 * Created by Daniel on 24.3.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        WeeklyCalendar calendar = new WeeklyCalendar();
        calendar.addEntry("Monday","sport");
        calendar.addEntry("Friday","sleeping");

        for (WeeklyEntry weeklyEntry : calendar.getWeeklySchedule()) {
            System.out.println(weeklyEntry);
        }
    }
}
