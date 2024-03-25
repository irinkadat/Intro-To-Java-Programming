package chapter_12;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter interest rate: ");
            double annualInterestRate = scanner.nextDouble();

            System.out.println("Enter number of years: ");
            int numberOfYears = scanner.nextInt();

            System.out.println("Enter loan amount: ");
            double loanAmount = scanner.nextDouble();

            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            System.out.println(loan.getMonthlyPayment());

    }
}
