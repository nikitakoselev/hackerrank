package edu.nkoselev.hackerrank.thirtydays.day20.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }

    private static void swap(int[] a, int i, int i1) {
        int j;
        j = a[i];
        a[i] = a[i1];
        a[i1] = j;
    }
}
