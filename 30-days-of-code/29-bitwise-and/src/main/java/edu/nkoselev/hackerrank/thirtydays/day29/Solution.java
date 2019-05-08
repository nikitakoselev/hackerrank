package edu.nkoselev.hackerrank.thirtydays.day29;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);


            System.out.println(((k - 1) | k) <= n ? k - 1 : k - 2);


        }

        scanner.close();
    }
}
