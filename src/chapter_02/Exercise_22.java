package chapter_2;
import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as an integer (e.g., 1156 for $11.56): ");
        int amount = input.nextInt();

        int numberOfDollars = amount / 100;
        int remainingAmount = amount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount $" + amount / 100.0 + " consists of");
        System.out.println("    " + numberOfDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");

        input.close();
    }
}
