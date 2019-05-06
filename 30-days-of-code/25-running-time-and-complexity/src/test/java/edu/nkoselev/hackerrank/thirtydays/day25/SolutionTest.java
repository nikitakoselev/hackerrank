package edu.nkoselev.hackerrank.thirtydays.day25;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SolutionTest {
    Solution sol = new Solution();

    @Test
    public void basicTests() {
        assertFalse(sol.isPrime(1));
        assertTrue(sol.isPrime(2));
        assertTrue(sol.isPrime(3));
        assertFalse(sol.isPrime(4));
        assertTrue(sol.isPrime(5));
        assertFalse(sol.isPrime(361));
        assertTrue(sol.isPrime(907));
    }

    @Test
    public void bigTests() {
        assertFalse(sol.isPrime(1010752));
        assertTrue(sol.isPrime(1010753));
    }

    @Test
    public void failingTest() {

    }
}
