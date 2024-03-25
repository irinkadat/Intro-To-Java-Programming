package chapter_02;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        int currentP = 312032486;
        int yearInSeconds = 365 * 24 * 3600;

        int babyInYear = yearInSeconds / 7;
        int deathInYear = yearInSeconds / 13;
        int immigrantInYear = yearInSeconds / 45;

        for (int i = 0; i < years; i++) {
            currentP += babyInYear - deathInYear + immigrantInYear ;

        }

        System.out.printf("The population in %d years is %d" , years,  currentP);
    }
}
