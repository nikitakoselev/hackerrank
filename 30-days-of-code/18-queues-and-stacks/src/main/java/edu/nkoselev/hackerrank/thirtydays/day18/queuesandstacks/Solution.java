package edu.nkoselev.hackerrank.thirtydays.day18.queuesandstacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    //LILO
    private Deque<Character> queue = new ArrayDeque<>();
    //FIFO
    private Deque<Character> stack = new ArrayDeque<>();

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private char dequeueCharacter() {
        return queue.getLast();
    }

    private void pushCharacter(char c) {
        queue.add(c);
    }

    private char popCharacter() {
        return queue.getFirst();
    }
}
