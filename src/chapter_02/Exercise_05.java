package chapter_02;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");

        double amount = scanner.nextDouble();
        double rate = scanner.nextDouble();

        double[] res = Tip(amount,rate);
        System.out.printf("The gratuity is $%.2f and total is $%.2f", res[0], res[1]);

    }
    static double[] Tip(double amount, double rate ){
        double tip = amount * rate/100;
        double total = amount + tip;
        return new double[]{tip, total } ;

    }

}
