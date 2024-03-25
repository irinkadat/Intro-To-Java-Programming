package chapter_12;

import java.util.Scanner;

import static chapter_12.BinaryConverter.bin2Dec;

public class Exercise_09 {
    public static void main(String[] args) {
        System.out.println("Enter binary string: ");
        Scanner input = new Scanner(System.in);
        String binaryStr = input.nextLine();

        try {
            System.out.println(bin2Dec(binaryStr));
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
