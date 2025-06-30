package evaluationassignment.uniqueNoOfOccurences;

import java.util.Scanner;

public class UniqueNoOfOccurences {

    public static String isFrequencyUnique(int arr[], int n) {
        int count = 0, duplicateCount = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                duplicateCount = count;
            }
            if (count > 1 && count == duplicateCount) {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter elements in an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isFrequencyUnique(arr, size));
    }
}
