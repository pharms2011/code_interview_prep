package com.google.medium;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/

import java.util.List;

public class LengthOfLongestSubstring {
    //Given a string s, find the length of the longest substring without repeating characters.

    /*
        Runtime:        15 ms
        Memory Usage:   47.6 MB
    * */
    public static int lengthOfLongestSubstring(String s) {
        int longestSubLen = 0;
        int windowStart = 0;
        int prevWindow = 0;
        for(int i = 0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            String window = s.substring(windowStart, i+1);
            if(window.indexOf(currentChar) != window.lastIndexOf(currentChar)){
                windowStart = window.indexOf(currentChar)+1+prevWindow;
                prevWindow = windowStart;
                continue;
            }
            if(longestSubLen < window.length()){
                longestSubLen = window.length();
            }
        }
        return longestSubLen;
    }
}
