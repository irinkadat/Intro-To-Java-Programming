package chapter_13;
import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(3.5);
        numbers.add(1.2);
        numbers.add(2.7);

        System.out.println("Before sorting: " + numbers);
        bubbleSort(numbers);
        System.out.println("After sorting: " + numbers);
    }

    public static void bubbleSort(ArrayList<Double> list) {
        int n = list.size();
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1) > list.get(i)) {

                    double temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        }
    }
}
