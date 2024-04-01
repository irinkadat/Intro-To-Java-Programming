package chapter_13;

public class Exercise_14 {
        public static void main(String[] args) {
            Rational r1 = new Rational(1, 4);
            Rational r2 = new Rational(2, 3);

            Rational sum = r1.add(r2);
            Rational difference = r1.subtract(r2);
            Rational product = r1.multiply(r2);
            Rational quotient = r1.divide(r2);

            System.out.println("Rational 1: " + r1);
            System.out.println("Rational 2: " + r2);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

            System.out.println("Comparison:");
            System.out.println("r1 == r2 : " + r1.equals(r2));
            System.out.println("r1 > r2  : " + (r1.compareTo(r2) > 0));
            System.out.println("r1 < r2  : " + (r1.compareTo(r2) < 0));}

}

