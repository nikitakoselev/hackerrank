package edu.socks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SocksTest {
    @Test
    public void basicTests() {
        assertEquals(3, Solution.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
