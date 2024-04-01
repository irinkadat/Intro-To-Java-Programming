package chapter_13;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_03 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 5; i > 0 ; i--) {
            list.add((double) i);
        }
        sortArr(list);
        System.out.println(list);
    }

    public static void sortArr(ArrayList<Double> list) {
        Collections.sort(list);
    }

}


