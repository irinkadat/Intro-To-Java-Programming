package chapter_13;

public class Octagon extends GeometricObject implements Comparable<Octagon> , Cloneable {

    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        return 0;
    }
}
