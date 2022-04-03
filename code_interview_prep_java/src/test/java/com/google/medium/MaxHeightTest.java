package com.google.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxHeightTest {

    @Test
    public void test(){
//        assertEquals(49, MaxHeight.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, MaxHeight.maxArea(new int[]{2,1}));
    }
}
