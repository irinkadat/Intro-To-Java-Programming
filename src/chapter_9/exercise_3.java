package chapter_9;
import java.util.Date;


public class exercise_3 {
    public static void main(String[] args) {
        long[] elapsedTimes = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};

        for (long elapsedTime : elapsedTimes) {
            Date date = new Date(elapsedTime);
            System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
            System.out.println("Date and time: " + date.toString());
            System.out.println();
        }
    }
}
