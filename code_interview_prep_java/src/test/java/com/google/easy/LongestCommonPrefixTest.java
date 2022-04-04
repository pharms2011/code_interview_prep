package com.google.easy;

import org.junit.Test;

import static org.junit.Assert.*;


public class LongestCommonPrefixTest {
    @Test
    public void test(){
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
