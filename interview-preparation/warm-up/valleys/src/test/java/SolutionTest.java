import edu.valleys.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void simpleTests() {
        Assert.assertEquals(1, Solution.countingValleys(8, "UDDDUDUU"));
    }
}