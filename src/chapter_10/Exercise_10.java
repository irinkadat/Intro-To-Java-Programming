package chapter_10;

public class Exercise_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            System.out.println(queue.dequeue());
        }
    }
}

