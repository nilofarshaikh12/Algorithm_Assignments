package evaluationassignment.uniqueNoOfOccurences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueNoOfOccurences {

    public static boolean isFrequencyUnique(int arr[], int n) {
        Map<Integer, Integer> frequencyList = new HashMap<>();

        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                frequencyList.put(arr[i], count);
                count = 1;
            }

            if (i == arr.length - 2) {
                frequencyList.put(arr[i], count);
            }
        }
        Set<Integer> valueSet = new HashSet<>(frequencyList.values());

        return frequencyList.size() == valueSet.size();
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
