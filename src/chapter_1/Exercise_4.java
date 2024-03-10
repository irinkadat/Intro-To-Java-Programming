package chapter_1;

public class Exercise_4 {
    public static void main(String[] args) {

        System.out.println("i" + "\t" + "i^2" + "\t" + "i^3");
        for (int i = 1; i < 5; i++) {
            System.out.println(i + "\t" + (int)Math.pow(i,2) + "\t" + (int)Math.pow(i,3));
        }

    }
}
