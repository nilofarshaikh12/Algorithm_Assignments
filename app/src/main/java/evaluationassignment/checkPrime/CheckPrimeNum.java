package evaluationassignment.checkPrime;

import java.util.Scanner;

public class CheckPrimeNum {
    public static int isPrime(int no) {
        if (no < 2) {
            return 0;
        }
        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num;

        if (sc.hasNextInt()) {
            num = sc.nextInt();
            System.out.println(isPrime(num));
        } else {
            System.out.println("Invalid Input...");
        }
        sc.close();
    }
}
