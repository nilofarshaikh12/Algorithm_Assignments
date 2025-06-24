package evaluationassignment.thirdLargestElement;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ThirdLargestElement {

    public static int getThirdLargestElement(int arr[], int n) {
        if (n < 3) {
            return -1;
        }
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // reverse to get third maximum
        for (int num : arr) {
            set.add(num); // add to set remove duplicate
        }
        if (set.size() < 3) {
            return -1;
        }

        int count = 0;
        for (int num : set) {
            count++;
            if (count == 3)
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getThirdLargestElement(arr, size);
        String str = (result != -1) ? "Third largest element is:" + result
                : "Not enough distinct elements to determine the third largest";
        System.out.println(str);
    }
}
