package chapter_2;
import java.util.Scanner;

public class Exercise_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        if (temperature < -58 || temperature > 41 || windSpeed < 2) {
            System.out.println("The input values are out of range.");
        } else {
            double windChillIndex = calculateWindChill(temperature, windSpeed);

            System.out.printf("The wind chill index is %.5f%n", windChillIndex);
        }

        scanner.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        double WindChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        return WindChillIndex;
    }
}
