package com.google.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntTest {

    @Test
    public void test(){
//        assertEquals(321, ReverseInt.reverse(123));
        assertEquals(-321, ReverseInt.reverse(-123));
    }
}
