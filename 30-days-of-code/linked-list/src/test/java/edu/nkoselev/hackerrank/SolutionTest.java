package edu.nkoselev.hackerrank;

import edu.nkoselev.hackerrank.linkedlist.Node;
import edu.nkoselev.hackerrank.linkedlist.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SolutionTest {
    @org.junit.Test
    public void testForNull() {
        Solution s = new Solution();
        assertNotNull(s.insert(null,1));
    }

    @Test
    public void hackerRankTest1() {
        Node head = Solution.insert(null,2);
        Solution.insert(head,3);
        Solution.insert(head,4);
        Solution.insert(head,1);

        Assert.assertEquals(2,head.data);
        Assert.assertEquals(3,head.next.data);
        Assert.assertEquals(4,head.next.next.data);
        Assert.assertEquals(1,head.next.next.next.data);

    }


}
