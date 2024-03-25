package chapter_12;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first num: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second num: ");
                num2 = scanner.nextInt();

                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Enter integers only.");
                scanner.nextLine();
            }
        }

        int sum = num1 + num2;
        System.out.println( num1 + " + " + num2 + " = " + sum);

        scanner.close();
    }
}
