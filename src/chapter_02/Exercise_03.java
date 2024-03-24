package chapter_2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");

        double foot = scanner.nextDouble();
        double meters = feetToMeters(foot);

        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println(df.format(foot)+ " feet is " +  df.format(meters) + " meters");

        scanner.close();

    }
    static double feetToMeters(double foot){
        return foot * 0.305;
    }

}