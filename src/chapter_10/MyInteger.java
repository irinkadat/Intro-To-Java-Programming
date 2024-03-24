package chapter_10;
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger number) {
        return number.isEven();
    }

    public static boolean isOdd(MyInteger number) {
        return number.isOdd();
    }

    public static boolean isPrime(MyInteger number) {
        return number.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger number) {
        return this.value == number.value;
    }

    public static int parseInt(char[] chars) {
        return parseInt(new String(chars));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
