package evaluationassignment.sievePrintPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SievePrintPrime {

    public static List<Integer> sieveOfEratosthenes(int n) {
        if (n <= 1) {
            System.out.println("There is no prime number for given limit");
            return new ArrayList<>();
        }
        boolean[] isPrime = new boolean[n + 1];
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int limit = sc.nextInt();

        List<Integer> listPrimes = sieveOfEratosthenes(limit);
        for (int primes : listPrimes) {
            System.out.print(primes + "\t");
        }
    }
}
