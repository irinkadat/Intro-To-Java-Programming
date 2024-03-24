package chapter_10;
/* (Displaying the prime numbers) Write a program that displays all the prime numbers less
 than 120 in decreasing order. Use the StackOfIntegers class to store the prime numbers
 (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order. */

public class Exercise_6 {
    public static void main(String[] args) {
        StackOfIntegers primesStack = new StackOfIntegers();

        for (int num = 2; num < 120; num++) {
            if (isPrime(num)) {
                primesStack.push(num);
            }
        }

        System.out.println("Prime numbers less than 120 in decreasing order:");
        while (!primesStack.empty()) {
            System.out.print(primesStack.pop() + " ");
        }
    }

    private static boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
