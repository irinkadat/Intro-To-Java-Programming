package chapter_2;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();


        scanner.close();

        double area = Math.PI * radius * radius;
        double volume = area * length;

        System.out.println("The area is: " +  area);
        System.out.println("The volume is: " +  volume);

    }
}
