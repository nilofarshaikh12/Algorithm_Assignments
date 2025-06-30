package evaluationassignment.pairsWithGivenSum;

import java.util.Scanner;

public class PairsWithGivenSum {

    public static int getPairCount(int arr[], int n, int given) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == given)
                    count++;
            }
        }
        if (count == 0)
            return -1;
        else
            return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid size..");
            return;
        }

        System.out.println("Enter given sum:");
        int given = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getPairCount(arr, size, given));
    }
}
