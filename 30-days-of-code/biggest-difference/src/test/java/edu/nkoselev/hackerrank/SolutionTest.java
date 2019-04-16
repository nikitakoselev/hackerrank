package edu.nkoselev.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCreation() {
        int[] a = {1, 2, 3, 4};
        Difference d = new Difference(a);

        assertArrayEquals(a, d.elements);
    }


    @Test
    public void test1() {
        int[] a = {10, 2, 50, 4, 3, 100};
        Difference d = new Difference(a);
        d.computeDifference();
        assertEquals(98, d.maximumDifference);
    }
}
