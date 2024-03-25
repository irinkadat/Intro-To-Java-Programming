package chapter_12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter First num: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second num: ");
                double num2 = scanner.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double res;

                switch (operator) {
                    case '+':
                        res = num1 + num2;
                        break;
                    case '-':
                        res = num1 - num2;
                        break;
                    case '*':
                        res = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Error: Division by zero");
                        }
                        res = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }
                System.out.println("Result: " + res);

                System.out.print("Do you want to perform another calculation? (Y/N): ");
                String choice = scanner.next();
                if (!choice.equalsIgnoreCase("Y")) {
                    break;
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Error: Input is not a valid number");
        } catch (ArithmeticException | IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            scanner.close();
        }



        // Code without error handler
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter First num: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Enter second num: ");
//            double num2 = scanner.nextDouble();
//
//            System.out.print("Enter operator (+, -, *, /): ");
//            char operator = scanner.next().charAt(0);
//
//            double res;
//
//            if (operator == '+') {
//                res = num1 + num2;
//            } else if (operator == '-') {
//                res = num1 - num2;
//            } else if (operator == '*') {
//                res = num1 * num2;
//            } else if (operator == '/') {
//                if (num2 == 0) {
//                    System.out.println("Error: Division by zero");
//                    continue;
//                }
//                res = num1 / num2;
//            } else {
//                System.out.println("Error: Invalid operator");
//                continue;
//            }
//            System.out.println("Result: " + res);
//
//            System.out.print("Do you want to perform another calculation? (Y/N): ");
//            String choice = scanner.next();
//            if (!choice.equalsIgnoreCase("Y")) {
//                break;
//            }
//        }
//        scanner.close();

    }
}
