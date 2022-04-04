package com.google.easy;

public class LongestCommonPrefix {
    /*
        Runtime: 1 ms, faster than 81.77% of Java online submissions for Longest Common Prefix.
        Memory Usage: 42 MB, less than 65.14% of Java online submissions for Longest Common Prefix.
    * */
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(String s: strs){
            boolean prefixNotFound = true;
            while(!prefix.isEmpty() && prefixNotFound){
                int minLen = Math.min(prefix.length(), s.length());
                if(!s.substring(0, minLen).equals(prefix)){
                    prefix = prefix.substring(0, prefix.length()-1);
                }
                else{
                    prefixNotFound = false;
                }
            }
        }
        return prefix;
    }
}
