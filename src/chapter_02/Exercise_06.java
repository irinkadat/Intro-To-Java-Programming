package chapter_02;
import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int res = sumOfDigits(number);
        System.out.println("The sum of the digits is " + res);
        
        
    }
    
    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;


    }
    

}
