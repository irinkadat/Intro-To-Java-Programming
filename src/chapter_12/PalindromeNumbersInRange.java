package chapter_12;
import java.util.ArrayList;

public class PalindromeNumbersInRange {

    public static void main(String[] args) {
        int n = 100;
        int m = 200;

        int[] palindromeArray = findPalindromes(n, m);
        System.out.println("Palindromes between " + n + " and " + m + ": ");
        for (int palindrome : palindromeArray) {
            System.out.print(palindrome + " ");
        }
    }
    public static int[] findPalindromes(int n, int m) {
        ArrayList<Integer> palindromes = new ArrayList<>();

        for (int num = n; num <= m; num++) {
            if (isPalindrome(num)) {
                palindromes.add(num);
            }
        }
        int[] palindromeArray = new int[palindromes.size()];
        for (int i = 0; i < palindromes.size(); i++) {
            palindromeArray[i] = palindromes.get(i);
        }
        return palindromeArray;
    }

    private static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
        int left = 0;
        int right = strNum.length() - 1;

        while (left < right) {
            if (strNum.charAt(left) != strNum.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

