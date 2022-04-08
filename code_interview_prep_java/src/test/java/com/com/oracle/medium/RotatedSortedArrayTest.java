package com.com.oracle.medium;

import com.oracle.medium.RotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotatedSortedArrayTest {

    @Test
    public void test(){
//        RotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 0);
        assertEquals(1,RotatedSortedArray.search(new int[] {1,3},3));
    }
}
