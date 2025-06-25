package evaluationassignment.firstAndLastOccurenceOfX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLastOccurenceOfX {

    public static List<Integer> firstAndLastOccIndex(int arr[], int n, int value) {
        int last = -1, first = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        if (first == -1) {
            list.add(-1);
        } else {
            list.add(first);
            list.add(last);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to find frequency");
        int value = sc.nextInt();

        List<Integer> result = firstAndLastOccIndex(arr, size, value);
        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println("Value " + value + " not found in array");
        } else {
            System.out.println("Fisrt occurence index:" + result.get(0) + "\nLast occurence index:" + result.get(1));
        }
    }
}
