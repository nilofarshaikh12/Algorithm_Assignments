package evaluationassignment.nthFibonacciNumber;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static Integer nthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for n <= 0");
        }
        int f1 = 0, f2 = 1, fib = 0;
        if (n <= 0) {
            return null;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        for (int i = 2; i < n; i++) {
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the place you want to find fibonacci number:");
        int no = sc.nextInt();

        System.out.println(nthFibonacci(no));
    }
}
