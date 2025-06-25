package evaluationassignment.smallestAndSecondSmallest;

import java.util.Scanner;

public class SmallestAndSecondSmallest {

    public static String getSmallestAndSecondSmallest(int arr[], int n) {
        if (n < 2) {
            return "Array must have at least two elements...";
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return (secondSmallest == Integer.MAX_VALUE)
                ? "No second smallest element found all elements might be equal"
                : "Smallest element:" + smallest + "\nSecond smallest element:" + secondSmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getSmallestAndSecondSmallest(arr, size));
    }
}
