package evaluationassignment.checkPalindromeString;

import java.util.Scanner;

public class CheckPalindromeString {
    public static int isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        int end = ch.length - 1;
        for (int i = 0; i < ch.length / 2; i++, end--) {
            if (ch[i] != ch[end]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();

        System.out.println(isPalindrome(str1));
    }
}
