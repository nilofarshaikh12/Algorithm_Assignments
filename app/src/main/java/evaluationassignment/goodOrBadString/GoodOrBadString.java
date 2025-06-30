package evaluationassignment.goodOrBadString;

import java.util.Scanner;

public class GoodOrBadString {

    public static String checkGoodOrBad(String str) {
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowelCount++;
                consonantCount = 0;
            } else if (ch[i] == '?') {
                vowelCount++;
                consonantCount++;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            if (vowelCount > 5 || consonantCount > 3)
                return "Bad String";
        }
        return "Good String";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println(checkGoodOrBad(str));
    }
}
