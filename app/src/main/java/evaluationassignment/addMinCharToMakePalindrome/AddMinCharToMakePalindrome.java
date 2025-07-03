package evaluationassignment.addMinCharToMakePalindrome;

import java.util.Scanner;

public class AddMinCharToMakePalindrome {

    public static int addMinChar(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int n = str.length();
        str = str.toLowerCase();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String substring = str.substring(0, i + 1);
            if (isPalindrome(substring) && max < substring.length()) {
                max = substring.length();
            }
        }
        return str.length() - max;
    }

    private static boolean isPalindrome(String str) {

        for (int start = 0, end = str.length() - 1; start < end; start++, end--) {
            if (str.charAt(start) != str.charAt(end))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println(addMinChar(str));
    }
}
