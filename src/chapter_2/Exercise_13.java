package chapter_2;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();

        double annualInterestRate = 0.05;

        double monthlyInterestRate = annualInterestRate / 12.0;
        double accountValue = 0;

        for (int month = 1; month <= 6; month++) {
            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
        }

        // Display the account value after the sixth month
        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);

        scanner.close();
    }
}
