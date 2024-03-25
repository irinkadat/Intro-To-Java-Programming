package chapter_10;
import java.util.Scanner;

public class Exercise_07 {

    private static Account[] accounts = new Account[10];

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id: ");
            int id = userInput.nextInt();

            if (id < 0 || id >= 10 || accounts[id] == null) {
                System.out.println("Invalid id. Please enter a correct id.");
                continue;
            }

            displayMainMenu();

            int selectedOpt;
            do {
                System.out.print("Choose an option: ");
                selectedOpt = userInput.nextInt();

                switch (selectedOpt) {
                    case 1:
                        System.out.println("Balance: " + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Amount to withdraw: ");
                        double amountToWithdraw = userInput.nextDouble();
                        accounts[id].withdraw(amountToWithdraw);
                        break;
                    case 3:
                        System.out.print("Amount to deposit: ");
                        double amountToDeposit = userInput.nextDouble();
                        accounts[id].deposit(amountToDeposit);
                        break;
                    case 4:
                        System.out.println("Main menu.");
                        break;
                    default:
                        System.out.println("Invalid option. Please enter a valid option.");
                        break;
                }

                if (selectedOpt != 4) {
                    displayMainMenu();
                }
            } while (selectedOpt != 4);
        }
    }

    private static void displayMainMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}
