package chapter_12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise_10 {
    public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        }
    }
}
