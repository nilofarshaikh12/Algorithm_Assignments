package evaluationassignment.findFactorial;

import java.util.Scanner;

public class FindFactorialOfNumber {

    public static int factorial(int no) {
        if (no < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        try {
            System.out.println(factorial(num));
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
