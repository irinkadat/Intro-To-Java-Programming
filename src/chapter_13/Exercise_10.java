package chapter_13;

public class Exercise_10 {
    public static void main(String[] args) {

    }
}


class Rectangle2 extends GeometricObject implements Comparable<Rectangle2> {

    private double width;
    private double height;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle2(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle2 otherRect = (Rectangle2) obj;
        return Double.compare(this.getArea(), otherRect.getArea()) == 0 ;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle2 object) {
        return Double.compare(this.getArea() , object.getArea());
        }
    }
