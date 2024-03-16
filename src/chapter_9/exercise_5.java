package chapter_9;
import java.util.GregorianCalendar;

public class exercise_5 {

    public static void main(String[] args) {
        System.out.println("Current Date: ");
        displayDate(System.currentTimeMillis());

        System.out.println("Date with elapsed time: ");
        displayDate(1234567898765L);
    }

    public static void displayDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);


        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println();
    }
}
