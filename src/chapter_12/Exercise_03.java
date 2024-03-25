package chapter_12;
import java.util.Random;
import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(1000);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        try {
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element);

        }catch (IndexOutOfBoundsException ex){
            System.out.println("Error " + ex.getMessage());
        }
        scanner.close();
    }
}
