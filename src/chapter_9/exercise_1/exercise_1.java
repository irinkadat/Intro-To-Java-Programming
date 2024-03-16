package chapter_9.exercise_1;

public class exercise_1 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.printf("width: %f height: %f \n", rect.width,rect.height);
        System.out.printf("Area: %.2f\n",rect.getArea());
        System.out.printf("Perimeter: %.2f\n", rect.getPerimeter());

        System.out.printf("\nwidth: %.2f height: %.2f\n", rect2.width, rect2.height);
        System.out.printf("Area: %.2f\n", rect2.getArea());
        System.out.printf("Perimeter: %.2f\n", rect2.getPerimeter());

    }

}


