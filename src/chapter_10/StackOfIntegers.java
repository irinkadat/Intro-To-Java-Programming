package chapter_10;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        return elements[--size];
    }

}

