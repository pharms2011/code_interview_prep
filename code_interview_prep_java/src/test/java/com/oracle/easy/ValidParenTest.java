package com.oracle.easy;

import com.oracle.easy.ValidParen;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenTest {

    @Test
    public void test(){
        assertTrue(ValidParen.isValid("{}"));
        assertFalse(ValidParen.isValid("{]{"));
    }
}
