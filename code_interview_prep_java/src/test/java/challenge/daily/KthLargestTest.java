package challenge.daily;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {

    @Test
    public void test(){
        KthLargest kthLargest = new KthLargest(3, new int[] {4,5,8,2});
        int kth = kthLargest.add(3);
        assertEquals(4, kth);
        kth = kthLargest.add(7);
        assertEquals(5, kth);
    }
}
