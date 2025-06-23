package evaluationassignment.checkPalindromeNumber;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static String isPalindrome(int no) {
        int temp = no, rev = 0;

        while (no > 0) {
            rev = (no % 10) + (rev * 10);
            no = no / 10;
        }
        String str = (rev == temp) ? "yes" : "no";
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
    }
}
