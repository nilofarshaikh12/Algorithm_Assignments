package evaluationassignment.confusedPappu;

import java.util.Scanner;

public class ConfusedPappu {

    public static int findDiff(int amt) {
        String originalAmt = Integer.toString(amt);
        String newAmt = originalAmt.replace('6', '9');
        int mistakenAmt = Integer.parseInt(newAmt);

        return mistakenAmt - amt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        System.out.println(findDiff(amount));
    }
}
