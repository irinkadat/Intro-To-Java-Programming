package chapter_10;

public class MyPoint {
    double x, y;

    public MyPoint () {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() { return x;};
    public double getY() { return y; }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((y - this.y), 2)+ Math.pow((x - this.x), 2));
    }

    public double distance(MyPoint point){
        return Math.sqrt(Math.pow((point.getY() - y), 2)+ Math.pow((point.getX() - x), 2));
    }

}
