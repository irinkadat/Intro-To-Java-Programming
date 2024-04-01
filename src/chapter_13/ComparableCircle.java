package chapter_13;

public class ComparableCircle extends Circlee implements Comparable<Circlee> {
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
