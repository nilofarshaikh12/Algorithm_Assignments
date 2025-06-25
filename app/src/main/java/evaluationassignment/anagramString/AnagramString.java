package evaluationassignment.anagramString;

import java.util.Scanner;

public class AnagramString {

    public static int countAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] freq = new int[26];

        for (char ch : str1.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            freq[ch - 'a']--;
        }

        int deletedCount = 0;
        for (int count : freq) {
            deletedCount += Math.abs(count);
        }
        return deletedCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(countAnagram(str1, str2));
    }
}
