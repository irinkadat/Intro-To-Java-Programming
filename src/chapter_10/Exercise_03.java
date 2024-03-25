package chapter_10;

public class Exercise_03 {
    public static void main(String[] args) {

        MyInteger num1 = new MyInteger(10);
        MyInteger num2 = new MyInteger(13);
        MyInteger num3 = new MyInteger(17);

        System.out.println("Is " + num1.getValue() + " even? " + num1.isEven());
        System.out.println("Is " + num1.getValue() + " odd? " + num1.isOdd());
        System.out.println("Is " + num1.getValue() + " prime? " + num1.isPrime());

        System.out.println("Is 20 even? " + MyInteger.isEven(20));
        System.out.println("Is 20 odd? " + MyInteger.isOdd(20));
        System.out.println("Is 20 prime? " + MyInteger.isPrime(20));

        System.out.println("Is " + num2.getValue() + " even? " + MyInteger.isEven(num2));
        System.out.println("Is " + num2.getValue() + " odd? " + MyInteger.isOdd(num2));
        System.out.println("Is " + num2.getValue() + " prime? " + MyInteger.isPrime(num2));

        System.out.println("Is " + num3.getValue() + " equal to 17? " + num3.equals(17));
        System.out.println("Is " + num3.getValue() + " equal to " + num1.getValue() + "? " + num3.equals(num1));

        char[] chars = {'1', '2', '3', '4', '5'};
        System.out.println("Parsed int from char array: " + MyInteger.parseInt(chars));
        String str = "12345";
        System.out.println("Parsed int from String: " + MyInteger.parseInt(str));
    }
}

