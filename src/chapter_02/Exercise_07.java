package chapter_2;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long[] result = calculateYearsAndDays(minutes);
        long years = result[0];
        long days = result[1];

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }

    public static long[] calculateYearsAndDays(long minutes) {
        final long minutesPerYear = 365 * 24 * 60;
        final long minutesPerDay = 24 * 60;

        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;

        long days = remainingMinutes / minutesPerDay;

        return new long[]{years, days};
    }
}

