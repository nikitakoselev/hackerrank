import org.junit.Test;
import repeat.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void simpleTest() {
        assertEquals(1000000000000l, Solution.repeatedString("a", 1000000000000l));

    }

    @Test
    public void bigTest() {
        assertEquals(16481469408l, Solution.repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570l));
    }
}
