package edu.nkoselev.hackerrank.thirtydays.day16.biggestdifference;

import java.util.Scanner;


class Difference {
    public int[] elements;
    public int maximumDifference = 0;

    public Difference(int[] a) {
        elements = a;
    }

    private int findMaximumDifference(int[] a) {
        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;

        for(int i : a){
            minValue = i < minValue ? i : minValue;
            maxValue = i > maxValue ? i : maxValue;
        }
        return maxValue - minValue;
    }

    public void computeDifference() {
        this.maximumDifference = findMaximumDifference(elements);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}