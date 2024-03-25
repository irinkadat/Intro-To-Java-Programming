package chapter_01;

public class Exercise_10 {
    public static void main(String[] args) {
        double v = calculateAverageSpeed(45, 45.5);
        double v2 = calculateAverageSpeed(45 * 1.6, 45.5);

        System.out.printf("Average speed in km: %.2f\nAverage speed in miles: %.2f", v, v2);
    }

    public static double calculateAverageSpeed(double distance, double time) {
        return distance / (time / 60);
    }
}


