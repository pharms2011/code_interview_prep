package com.google.easy;


import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void tests() {
        int[] testCaseResultOne = TwoSum.twoSum(new int[] {3,4,21,23,5,6,2,9,8},13);
        assertEquals(1, testCaseResultOne[0]);
        assertEquals(7, testCaseResultOne[1]);

        int[] testCaseResultTwo = TwoSum.twoSum(new int[] {3,4,5},7);
        assertEquals(0, testCaseResultTwo[0]);
        assertEquals(1, testCaseResultTwo[1]);

        int[] testCaseResultThree = TwoSum.twoSum(new int[] {3,4,21,23,5,6,2,9,8},14);
        assertEquals(4, testCaseResultThree[0]);
        assertEquals(7, testCaseResultThree[1]);
    }

    @Test
    public void testNone(){
        assertNull(TwoSum.twoSum(new int[] {3,4,5},10));
    }
}
