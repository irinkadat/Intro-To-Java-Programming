package chapter_12;
import java.util.Scanner;
public class Hex2Dec_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System. in) ;
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex. toUpperCase ())) ;
        } catch (NumberFormatException e) {
            System.out.println( e.getMessage());
        }
    }

        public static int hexToDecimal(String hex) {

            int decimalValue = 0;
            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
            return decimalValue;
        }

    public static int hexCharToDecimal(char ch) throws NumberFormatException {
        if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')) {
            if (ch >= 'A' && ch <= 'F') {
                return 10 + ch - 'A';
            } else if (ch >= 'a') {
                return 10 + ch - 'a';
            } else {
                return ch - '0';
            }
        } else {
            throw new NumberFormatException("Invalid hex character: " + ch);
        }
    }
    }