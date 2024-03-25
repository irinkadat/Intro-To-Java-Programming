package chapter_12;
public class BinaryConverter {
    public static int bin2Dec(String binary) throws BinaryFormatException {
        for (char ch : binary.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string format");
            }
        }

        int decimalValue = 0;
        for (int i = 0; i < binary.length(); i++) {
            char binaryChar = binary.charAt(i);
            int digit = binaryChar - '0';
            decimalValue = decimalValue * 2 + digit;
        }

        return decimalValue;
    }
}
