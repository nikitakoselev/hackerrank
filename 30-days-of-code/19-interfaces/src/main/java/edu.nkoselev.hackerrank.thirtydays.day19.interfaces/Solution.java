package edu.nkoselev.hackerrank.thirtydays.day19.interfaces;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        Set<Integer> result = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(i);
                result.add(n / i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).sum();
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}