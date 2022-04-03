package com.google.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntToRomanTest {

    /*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
* */

    @Test
    public void test(){
//        assertEquals("CXXIII", IntToRoman.intToRoman(123));
        assertEquals("MCMXCIV", IntToRoman.intToRoman(1994));
    }
}
