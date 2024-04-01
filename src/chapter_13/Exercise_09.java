package chapter_13;

public class Exercise_09 {
    public static void main(String[] args) {
        Circle2 circle1 = new Circle2(5);
        Circle2 circle2 = new Circle2(7);
        System.out.println(circle1.equals(circle2));
    }
}

abstract class GeometricObject4 {
    abstract double getArea();
}

class Circle2 extends GeometricObject4 implements Comparable<Circle2> {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Circle2 otherCircle) {
        return Double.compare(this.radius, otherCircle.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle2 circle = (Circle2) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}
