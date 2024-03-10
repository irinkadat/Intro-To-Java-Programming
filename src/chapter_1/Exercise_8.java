package chapter_1;

public class Exercise_8 {
    public static void main(String[] args) {
        double radius = 5.5d;
        double P = Math.PI;
        double perimeter = 2 * radius * P ;
        double area = radius * radius * P ;

        System.out.printf("perimeter: %f\narea: %f", perimeter, area);

    }
}
