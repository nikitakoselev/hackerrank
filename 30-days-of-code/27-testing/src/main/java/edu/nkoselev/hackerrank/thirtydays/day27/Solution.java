package edu.nkoselev.hackerrank.thirtydays.day27;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    private static class User {
        public String name;
        public String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<User> users = new ArrayList<>();


        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            users.add(new User(firstName, emailID));
        }

        List sortedUsers =
                users.stream()
                        .filter(e -> e.email.endsWith("@gmail.com"))
                        .map(e -> e.name)
                        .sorted()
                        .collect(Collectors.toList());

        sortedUsers.forEach(System.out::println);

        scanner.close();
    }
}
