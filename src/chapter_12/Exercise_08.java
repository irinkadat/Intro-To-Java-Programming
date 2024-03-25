package chapter_12;

import java.util.Scanner;

public class Exercise_08 {

    public static void main(String[] args) {
        System.out.println("Enter Hex String: ");
        Scanner input = new Scanner(System.in);
        try {
        String hexValue = input.nextLine();
        System.out.println(hex2Dec(hexValue));
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int hex2Dec(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!isHexChar(hexChar)) {
                throw new HexFormatException("Invalid hex string format");
            }
            int digit = hexCharToDecimmal(hexChar);
            decimalValue = decimalValue * 16 + digit;

        }
        return decimalValue;

    }

    private static boolean isHexChar(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }

    private static int hexCharToDecimmal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= 'a') {
            return 10 + ch - 'a';
        } else {
            return ch - '0';
        }

    }
}
