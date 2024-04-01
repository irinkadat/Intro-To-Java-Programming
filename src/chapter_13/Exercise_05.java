package chapter_13;

public class Exercise_05 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(3, 4);

        Circle largerCircle = (Circle) GeometricObject2.max(circle1, circle2);
        System.out.println("Larger circle: Radius = " + largerCircle.getRadius() + ", Area = " + largerCircle.getArea());

        Rectangle largerRectangle = (Rectangle) GeometricObject2.max(rectangle1, rectangle2);
        System.out.println("Larger rectangle: Width = " + largerRectangle.getWidth() + ", Height = " + largerRectangle.getHeight() +
                ", Area = " + largerRectangle.getArea());
    }
}


abstract class GeometricObject2 implements Comparable<GeometricObject2> {
    private String color;
    private boolean filled;

    public GeometricObject2() {
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();


    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject2 other) {

        return Double.compare(this.getArea(), other.getArea());
    }

    public static GeometricObject2 max(GeometricObject2 obj1, GeometricObject2 obj2) {
        return obj1.compareTo(obj2) >= 0 ? obj1 : obj2;
    }
}

class Rectangle extends GeometricObject2 {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


