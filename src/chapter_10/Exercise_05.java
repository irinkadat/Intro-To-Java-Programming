package chapter_10;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = userInput.nextInt();

        StackOfIntegers factorsStack = new StackOfIntegers();

        int divisor = 2;
        while (num != 1) {
            if (num % divisor == 0) {
                factorsStack.push(divisor);
                num /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.print("The smallest factors in decreasing order: ");
        while (!factorsStack.empty()) {
            System.out.print(factorsStack.pop() + " ");
        }
    }
}
