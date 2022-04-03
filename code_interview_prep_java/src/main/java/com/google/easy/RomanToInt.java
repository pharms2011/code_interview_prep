package com.google.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

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

    /*
        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.
    * */

    /*
        Runtime: 24 ms, faster than 8.07% of Java online submissions for Roman to Integer.
        Memory Usage: 54.3 MB, less than 5.07% of Java online submissions for Roman to Integer.
    * */
    public static int romanToInt(String s) {
        //MCMXCIV
        // 1000 -100 1000 -10 100 5
        int values[] = new int[s.length()];
        for(int i=0; i<s.length();i++){
            values[i] = charToInt(s.charAt(i));
        }
        int total = 0;
        int prevVal = 0;
        for(int i: values){
            if(prevVal != 0 && prevVal < i){
                total = total - 2*prevVal;
            }
            total += i;
            prevVal=i;
        }
        return total;
    }

    public static Integer charToInt(char c){
        Map<Character, Integer> mapper = new HashMap();
        mapper.put('M',1000);
        mapper.put('D',500);
        mapper.put('C',100);
        mapper.put('L',50);
        mapper.put('X',10);
        mapper.put('V',5);
        mapper.put('I',1);
        return mapper.get(c);
    }
}
