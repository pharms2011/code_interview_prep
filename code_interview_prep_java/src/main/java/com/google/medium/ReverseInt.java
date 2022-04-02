package com.google.medium;
// https://leetcode.com/problems/reverse-integer/

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
// signed 32-bit integer range [-231, 231 - 1], then return 0.
public class ReverseInt {

    /*
        Runtime: 1 ms, faster than 98.81% of Java online submissions for Reverse Integer.
        Memory Usage: 39.3 MB, less than 93.92% of Java online submissions for Reverse Integer.
    * */
    
    public static int reverse(int x) {
        int result = 0;
        long resultLong = 0;
        int intLen = (Math.abs(x)+"").length();
        for(int i =0; i<intLen; i++){
            int remainder = x%10;
            result += remainder * Math.pow(10, intLen-i-1);
            resultLong += (long)(remainder * Math.pow(10, intLen-i-1));
            x = x/10;
        }
        if(resultLong > Math.pow(2, 31) || resultLong <-Math.pow(2,31)){
            return 0;
        }
        return result;
    }
}
