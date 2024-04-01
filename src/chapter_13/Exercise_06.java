package chapter_13;
import java.lang.Comparable;

public class Exercise_06 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);
        String res = circle1.compareTo(circle2) >= 0 ? "circle 1 is grater!": "circle 2 is grater!" ;

        System.out.println(res);
    }
}
class Circlee {
    private double radius;

    public Circlee() {
        this(1.0);
    }

    public Circlee(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class ComparableCircle extends Circlee implements Comparable<Circlee> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circlee otherCircle) {
        double thisArea = this.getArea();
        double otherArea = otherCircle.getArea();
        return Double.compare(thisArea, otherArea);
    }
}