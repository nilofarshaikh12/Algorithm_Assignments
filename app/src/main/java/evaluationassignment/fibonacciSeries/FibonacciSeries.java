package evaluationassignment.fibonacciSeries;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

    public static List<Integer> series(int limit) {
        List<Integer> fibSeries = new ArrayList<>();

        if (limit <= 0) {
            return fibSeries; // return empty list if limit is 0 or less
        }
        int f1 = 0, f2 = 1;
        fibSeries.add(f1); // first term

        if (limit == 1) {
            return fibSeries;
        }

        fibSeries.add(f2); // second term
        for (int i = 2; i < limit; i++) {
            int fib = f1 + f2;
            fibSeries.add(fib);
            f1 = f2;
            f2 = fib;
        }
        return fibSeries;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();

        List<Integer> result = series(n);
        for (int num : result) {
            System.out.print(num + "\t");
        }
    }
}
