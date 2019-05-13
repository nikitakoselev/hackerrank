package edu.valleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static int countingValleys(int n, String s) {
        int level = 0;
        int valleysCount = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'U':
                    level++;
                    break;
                case 'D':
                    level--;
                    break;
                default:
                    break;
            }

            if (level == 0 && 'U' == c) {
                valleysCount++;
            }

        }

        return valleysCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
