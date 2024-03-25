package chapter_12;
import java.util.Date;
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        try {
            if (annualInterestRate <= 0) {
                throw new IllegalArgumentException("Interest rate must be greater than zero");
            }
            this.annualInterestRate = annualInterestRate;
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void setNumberOfYears(int numberOfYears) {
        try {
            if (numberOfYears <= 0) {
                throw new IllegalArgumentException("Number of years must be greater than zero");
            }
            this.numberOfYears = numberOfYears;
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        try {
            if (loanAmount <= 0) {
                throw new IllegalArgumentException("Loan amount must be greater than zero");
            }
            this.loanAmount = loanAmount;
        }catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfYears * 12));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}

