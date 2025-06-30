package evaluationassignment.equilibriumPoint;

import java.util.Scanner;

public class EquilibriumPoint {

    public static int equilibriumPoint(Integer[] arr, int size) {
        if (size == 1)
            return 1;
        if (size == 2)
            return -1;

        int temp = 0;
        for (int i = 1; i < arr.length - 1; i++)// 1 2 4 3 0
        {
            if (getSum(0, i, arr) == getSum(i + 1, arr.length, arr)) {
                temp = i + 1;
                break;
            } else
                temp = -1;
        }
        return temp;
    }

    private static int getSum(int start, int end, Integer arr[]) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }
        Integer arr[] = new Integer[size];
        System.out.println("Enter values in array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println(equilibriumPoint(arr, size));
    }
}
