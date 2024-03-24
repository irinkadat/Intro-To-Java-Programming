package chapter_9;
import java.util.Random;

public class Exercise_4 {
    public static void main(String[] args) {
        Random rand = new Random(1000);

        for (int i = 0; i < 50; i++) {
            int randomNum = rand.nextInt(101);
            System.out.println(randomNum);
        }
    }
}
