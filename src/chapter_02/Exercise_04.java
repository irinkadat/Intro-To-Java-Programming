package chapter_02;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");

        double pounds = scanner.nextDouble();
        double kilograms = poundsToKilograms(pounds);

        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println(df.format(pounds)+ " pounds is " +  df.format(kilograms) + " kilograms");

        scanner.close();

    }
    static double poundsToKilograms(double pounds){
        return pounds * 0.454;
    }

}
