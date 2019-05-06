import edu.nkoselev.hackerrank.thirtydays.day26.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void testExampleCase() {
        assertEquals(45, s.calculateFine("9 6 2015", "6 6 2015"));
        assertEquals(3500, s.calculateFine("31 8 2004", "20 1 2004"));
        assertEquals(0, s.calculateFine("1 1 1", "8 8 8"));
    }
}
