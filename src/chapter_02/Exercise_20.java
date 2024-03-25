package chapter_02;
import java.util.Scanner;


public class Exercise_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterest = calculateInterest(balance, annualInterestRate);

        System.out.printf("The interest is %.5f%n", monthlyInterest);

        scanner.close();
    }

    public static double calculateInterest(double balance, double annualInterestRate) {
        return balance * (annualInterestRate / 1200);
    }
}
