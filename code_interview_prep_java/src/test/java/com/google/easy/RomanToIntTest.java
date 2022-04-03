package com.google.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntTest {

    @Test
    public void test(){
//        assertEquals(3, RomanToInt.romanToInt("III"));
        assertEquals(1994, RomanToInt.romanToInt("MCMXCIV" ));
    }
}
