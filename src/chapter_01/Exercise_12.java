package chapter_01;

public class Exercise_12 {
    public static void main(String[] args) {
        double distanceMiles = 24.0;
        double timeHours = 1 + (40.0 / 60) + (35.0 / 3600);
        double distanceKilometers = distanceMiles * 1.6;
        double averageSpeed = distanceKilometers / timeHours;

        System.out.printf("Average speed: %.2f kilometers per hour", averageSpeed);
    }
}
