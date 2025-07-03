package evaluationassignment.maxProductSubarray;

import java.util.Scanner;

public class MaxProductSubarray {

    public static int maxProduct(int arr[], int n) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0];
        int min = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < n; i++) {

            int a = arr[i];
            int b = arr[i] * max;
            int c = arr[i] * min;

            // For max
            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }

            // For min
            if (a <= b && a <= c) {
                min = a;
            } else if (b <= a && b <= c) {
                min = b;
            } else {
                min = c;
            }

            // Update maxProd manually
            if (max > maxProd) {
                maxProd = max;
            }
        }

        return maxProd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int arr[] = new int[size];
        System.out.println("Enter values in array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println(maxProduct(arr, size));
    }
}
