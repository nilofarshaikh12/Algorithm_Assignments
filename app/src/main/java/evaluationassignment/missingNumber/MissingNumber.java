package evaluationassignment.missingNumber;

import java.util.Scanner;

public class MissingNumber {

    public static int findMissingNumber(int arr[], int n) {
        if (arr == null || arr.length != n - 1) {
            throw new IllegalArgumentException("Invalid input: array size should be n-1");
        }
        // total sum of natural no's upto 1 to n ==> n*(n+1)/2
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit of an array:");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Invalid limit");
            return;
        }
        int arr[] = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing number:" + findMissingNumber(arr, n));
    }
}
