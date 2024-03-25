package chapter_02;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();

        double acceleration = calculateAcceleration(v0, v1, t);
        System.out.println("The average acceleration is " + String.format("%.4f",acceleration));

        scanner.close();
    }

    public static double calculateAcceleration(double v0, double v1, double t) {
        return (v1 - v0) / t;
    }
}

