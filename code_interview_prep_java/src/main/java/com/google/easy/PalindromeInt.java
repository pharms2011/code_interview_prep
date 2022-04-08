package com.google.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeInt {
    /*
    * Runtime: 7 ms, faster than 90.40% of Java online submissions for Palindrome Number.
    * Memory Usage: 41.4 MB, less than 95.91% of Java online submissions for Palindrome
    * 04-07-22
    * */
    public boolean isPalindrome(int x) {
        List<Integer> digits = new ArrayList();
        if(x<0){
            return false;
        }
        while(x>0){
            int smallestPlaceValue = x%10;
            digits.add(smallestPlaceValue);
            x= x/10;
        }
        int l =0;
        int r = digits.size()-1;
        while(l <r){
            if(digits.get(l) != digits.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
