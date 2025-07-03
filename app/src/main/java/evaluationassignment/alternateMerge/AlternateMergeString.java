package evaluationassignment.alternateMerge;

import java.util.Scanner;

public class AlternateMergeString {

    public static String getAlternativeMergedString(String str1, String str2) {
        StringBuilder merged = new StringBuilder();

        int i = 0;
        while (i < str1.length() || i < str2.length()) {
            if (i < str1.length()) {
                merged.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                merged.append(str2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(getAlternativeMergedString(str1, str2));
    }
}
