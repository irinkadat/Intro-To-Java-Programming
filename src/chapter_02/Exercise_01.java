package chapter_02;
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args) {

        System.out.print("Enter a degree in Celsius: ");
        Scanner obj = new Scanner(System.in);
        double celsius = obj.nextDouble();

        double res = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is %.2f Fahrenheit ",celsius, res);

        obj.close();

    }
    static double celsiusToFahrenheit(double celsius){
        return (9.0/5 )* celsius + 32;
    }

}
