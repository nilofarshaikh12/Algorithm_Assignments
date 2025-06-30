package evaluationassignment.kthSmallestElement;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

    public static String findKthSmallestElement(int arr[], int n, int k) {
        if (k < 0 || k > n) {
            return "Invalid value of k";
        }
        Arrays.sort(arr);
        return k + "th smallest element:" + arr[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter distinct values in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter value of k:");
        int k = sc.nextInt();

        System.out.println(findKthSmallestElement(arr, size, k));
    }
}
