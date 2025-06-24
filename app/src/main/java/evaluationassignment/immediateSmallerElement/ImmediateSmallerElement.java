package evaluationassignment.immediateSmallerElement;

import java.util.Scanner;

public class ImmediateSmallerElement {

    public static int[] immediateSmaller(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int result[] = immediateSmaller(a, size);
        for (int ans : result) {
            System.out.print(ans + "\t");
        }
    }
}
