package evaluationassignment.stockBuyAndSell2;

import java.util.Scanner;

public class StockBuyAndSell2 {

    public static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int arr[] = new int[size];
        System.out.println("Enter the values : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Maximum Profit: " + maxProfit(arr));
    }
}
