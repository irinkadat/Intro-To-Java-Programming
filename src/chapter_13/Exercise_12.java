package chapter_13;

public class Exercise_12 {
    public static void main(String[] args) {
        GeometricObject2[] objects = new GeometricObject2[4];
        objects[0] = new Circle(5.0);
        objects[1] = new Circle(3.0);
        objects[2] = new Rectangle(3,4);
        objects[3] = new Rectangle(5,6);

        System.out.println(sumArea(objects));

    }

    public static double sumArea(GeometricObject2[] geometricObjects) {
        double sumOfAreas = 0;
        for(GeometricObject2 obj : geometricObjects) {
            sumOfAreas += obj.getArea();
        }
        return sumOfAreas;
    }
}

