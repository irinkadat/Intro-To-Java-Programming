package chapter_13;


public class Exercise_07 {
    public static void main(String[] args) {

        GeometricObject3[] shapes = new GeometricObject3[5];
        shapes[0] = new Square(5);
        shapes[1] = new Square(7);
        shapes[2] = new Square(3);
        shapes[3] = new Square(8);
        shapes[4] = new Square(6);

        for (GeometricObject3 shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println();
        }
    }
}

interface Colorable {
    void howToColor();
}

abstract class GeometricObject3 {
    abstract double getArea();
}

class Square extends GeometricObject3 implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}


