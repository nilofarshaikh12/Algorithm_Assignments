package evaluationassignment.checkSubsequence;

import java.util.Scanner;

public class CheckSubsequence {

    public static String checkForSubsequence(String str1, String str2) {
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        int temp = 0;
        for (int i = 0; i < ch1.length; i++) {
            boolean flag = false;
            for (int j = temp; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    temp = j + 1;
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return "no";
        }
        return "yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(checkForSubsequence(str1, str2));
    }
}
