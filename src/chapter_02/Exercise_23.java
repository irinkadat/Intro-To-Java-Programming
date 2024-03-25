package chapter_02;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f%n", costOfDriving);

        scanner.close();
    }
}
