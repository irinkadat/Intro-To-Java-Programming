package chapter_13;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise_02 {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.5);
        numbers.add(3);
        numbers.add(4.7);
        numbers.add(5);

        System.out.println("Original array: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled array: " + numbers);
    }

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }
}
