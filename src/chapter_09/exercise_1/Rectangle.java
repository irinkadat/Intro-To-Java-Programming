package chapter_09.exercise_1;

public class Rectangle {
    double width;
    double height;

    public  Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }
}
