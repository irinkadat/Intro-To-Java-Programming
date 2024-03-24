package chapter_10;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] newElements = new int[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

    public boolean empty() {
        return size == 0;
    }

}
