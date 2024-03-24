package chapter_1;

public class Exercise_13 {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        double determinant = a * d - b * c;

        double x = (e * d - b * f) / determinant;
        double y = (a * f - e * c) / determinant;

        System.out.println("Solution for x: " + x);
        System.out.println("Solution for y: " + y);

    }
}
