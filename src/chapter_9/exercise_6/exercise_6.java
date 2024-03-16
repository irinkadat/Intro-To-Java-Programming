package chapter_9.exercise_6;

public class exercise_6 {

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();

        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
