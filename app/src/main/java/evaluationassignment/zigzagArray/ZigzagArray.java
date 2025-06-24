package evaluationassignment.zigzagArray;

import java.util.Scanner;

public class ZigzagArray {

    public static int[] zigZagArr(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements into array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = zigZagArr(arr, size);
        for (int ans : result) {
            System.out.print(ans + "\t");
        }
    }
}
