package chapter_02;
import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        double investmentValue = calculateFutureValue(investmentAmount, annualInterestRate, numberOfYears);

        System.out.printf("Accumulated value is $%.2f%n", investmentValue);

        scanner.close();
    }

    public static double calculateFutureValue(double investmentAmount, double annualInterestRate, int numberOfYears) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
    }
}
