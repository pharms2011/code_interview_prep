package algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void test(){
        assertEquals(5, BinarySearch.sort(new int[] {1,2,5,4})[3]);
    }
}
