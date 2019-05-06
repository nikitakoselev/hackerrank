package edu.nkoselev.hackerrank.thirtydays.day25;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Solution sol = new Solution();
        while (T-- > 0) {
            int potentialPrime = sc.nextInt();
            String result = sol.isPrime(potentialPrime) ? "Prime" : "Not prime";
            System.out.println(result);
        }
    }

    Deque<Integer> primesTillN;

    public boolean isPrime(int potentialPrime) {
        if (potentialPrime < 2) {
            return false;
        } else if (potentialPrime == 2) {
            return true;
        } else {
            if (primesTillN == null || primesTillN.size() == 0 || (primesTillN.getLast() < (int) Math.sqrt(potentialPrime))) {
                primesTillN = findAllPrimes((int) Math.sqrt(potentialPrime));
            }
            for (int i : primesTillN) {
                if (potentialPrime % i == 0) {
                    return false;
                }
            }
        }

        return true;

    }

    private Deque<Integer> findAllPrimes(int maxMultiplierOfPotentialPrime) {
        Deque<Integer> provenPrimes = new ArrayDeque<>(Arrays.asList(2));
        Queue<Integer> potentialPrimes = new LinkedList<>(IntStream.range(2, maxMultiplierOfPotentialPrime + 1).boxed().collect(Collectors.toList()));

        while (potentialPrimes.size() > 0) {
            int prime = provenPrimes.peekLast();
            potentialPrimes.removeIf(n -> n % prime == 0);

            if (potentialPrimes.size() > 0) {
                provenPrimes.add(potentialPrimes.poll());
            }
        }

        return provenPrimes;
    }
}

