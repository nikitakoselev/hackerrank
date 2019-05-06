package edu.nkoselev.hackerrank.thirtydays.day26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println(s.calculateFine(scan.nextLine(), scan.nextLine()));
    }

    public int calculateFine(String real, String max) {
        final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d M y");
        final LocalDate bookReturned = LocalDate.parse(real, dateFormat);
        final LocalDate allowedMaxReturnDate = LocalDate.parse(max, dateFormat);

        if (bookReturned.isAfter(allowedMaxReturnDate)) {
            if (bookReturned.getYear() == allowedMaxReturnDate.getYear()) {
                if (bookReturned.getMonth() == allowedMaxReturnDate.getMonth()) {
                    return 15 * (int) ChronoUnit.DAYS.between(allowedMaxReturnDate, bookReturned);
                } else {
                    return 500 * (int) ChronoUnit.MONTHS.between(allowedMaxReturnDate, bookReturned);
                }
            } else {
                return 10_000;
            }
        }

        return 0;
    }
}
