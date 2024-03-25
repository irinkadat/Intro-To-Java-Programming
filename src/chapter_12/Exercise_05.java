package chapter_12;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter side1, side2, side3 of the triangle: ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Triangle created: " + triangle);
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        } catch (IllegalTriangleException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

