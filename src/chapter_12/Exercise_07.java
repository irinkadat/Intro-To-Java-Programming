package chapter_12;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        System.out.println("Enter the binary string: ");
        Scanner input = new Scanner(System.in);

        String binaryString = input.nextLine();

        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("Decimal value for binary string " + binaryString + " is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        for (char ch : binaryString.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new NumberFormatException("Invalid binary string");
            }
        }

        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char binaryChar = binaryString.charAt(i);
            decimalValue = decimalValue * 2 + (binaryChar - '0');
        }
        return decimalValue;
    }
}

