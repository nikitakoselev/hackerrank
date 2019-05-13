package hourglass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void simpleTest() {
        assertEquals(19, Solution.hourglassSum(
                new int[][]{
                        {
                                1, 1, 1, 0, 0, 0
                        },
                        {
                                0, 1, 0, 0, 0, 0
                        },
                        {
                                1, 1, 1, 0, 0, 0
                        },
                        {
                                0, 0, 2, 4, 4, 0
                        },
                        {
                                0, 0, 0, 2, 0, 0
                        },
                        {
                                0, 0, 1, 2, 4, 0
                        }
                }
        ));
    }

    @Test
    public void simpleTest2() {
        assertEquals(-19, Solution.hourglassSum(
                new int[][]{
                        {0, -4, -6, 0 - 7, -6},
                        {-1, -2, -6, -8, -3, -1},
                        {-8, -4, -2, -8, -8, -6},
                        {-3, -1, -2, -5, -7, -4},
                        {-3, -5, -3, -6, -6, -6},
                        {-3, -6, 0, -8, -6, -7}}));
    }
}
