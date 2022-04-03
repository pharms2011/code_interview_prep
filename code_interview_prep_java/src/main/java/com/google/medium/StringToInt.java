package com.google.medium;

/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

    1. Read in and ignore any leading whitespace.

    2.Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is
    either. This determines if the final result is negative or positive respectively. Assume the result is positive if
    neither is present.

    3.Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the
    string is ignored.

    4.Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is
    0. Change the sign as necessary (from step 2).

    If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains
    in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1
    should be clamped to 231 - 1.

    Return the integer as the final result.

* */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToInt {
    public static int myAtoi(String s) {
        long result = 0;
        //1. Read in and ignore any leading whitespace.
        String trim = s.trim();
        // 2.Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in
        // if it is either. This determines if the final result is negative or positive respectively. Assume the result
        // is positive if neither is present.
        boolean isNegative = false;
        while(trim.charAt(0) == '+' || trim.charAt(0) == '-'){
            if(trim.charAt(0) == '-'){
                isNegative = !isNegative;
                trim = trim.substring(1);
            }
            if(trim.charAt(0) == '+'){
                trim = trim.substring(1);
            }
        }
        for(int i=0; i<trim.length(); i++){
            if(charToLong(trim.charAt(i)) == null){
                trim = trim.substring(0,i);
                break;
            }
        }
        //    3.Read in next the characters until the next non-digit character or the end of the input is reached. The
        //    rest of the string is ignored.
        for(int i=0; i<trim.length(); i++){
            //    4.Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then
            //    the integer is 0. Change the sign as necessary (from step 2).
            Long longChar = charToLong(trim.charAt(i));
            result += charToLong(trim.charAt(i)) * Math.pow(10, trim.length()-i-1);
        }
        if(result>Math.pow(2,31)){
            if(isNegative){
                return (int)-(Math.pow(2,31)-1);
            }
            return (int)Math.pow(2,31);
        }
        if(isNegative){
            result = -result;
        }
        return (int)result;

    }

    public static Long charToLong(char c){
        Map<Character, Long> map = new HashMap<>();
        map.put('1',1l);
        map.put('2',2l);
        map.put('3',3l);
        map.put('4',4l);
        map.put('5',5l);
        map.put('6',6l);
        map.put('7',7l);
        map.put('8',8l);
        map.put('9',9l);
        map.put('0',0l);
        Long result = map.get(c);
        return result;
    }
}
