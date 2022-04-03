package com.google.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntTest {

    @Test
    public void test(){
//        assertEquals(123, StringToInt.myAtoi("123"));
//        assertEquals(123, StringToInt.myAtoi("+123"));
//        assertEquals(-123, StringToInt.myAtoi("-123"));
//        assertEquals(4193, StringToInt.myAtoi("4193 with words"));
//        assertEquals(0, StringToInt.myAtoi("a"));
//        assertEquals(-42, StringToInt.myAtoi("   -42"));
        assertEquals(-12, StringToInt.myAtoi("+-12"));
    }
}
