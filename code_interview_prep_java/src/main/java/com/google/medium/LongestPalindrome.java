package com.google.medium;

public class LongestPalindrome {

    public static String simpleLargestPalin(String s){
        String result = "";
        for(int i =0; i<s.length(); i++){
            // treat this char as the center of the longest palindrom
            String center = s.charAt(i)+"";
            int l = i-1;
            int r = i +1;
            while(s.charAt(r) == s.charAt(i)){
                
            }
        }
        return result;
    }
    // Given a string s, return the longest palindromic substring in s.
    public static String longestPalindrome(String s) {
        String longestPal = "";
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                String currSubString = s.substring(i,j+1);
                if(currSubString.length()>longestPal.length() &&
                        isPalindrome(currSubString)){
                    longestPal = currSubString;
                }
            }
        }
        return longestPal;
    }

    // The time complexity here is n, meaning the total time complexity is n^3...
    // There is a better may to check if the substring is a palandrome
    // We can check in the middle and move outward
    // ex. abaab we would consider each char as the center and expand as we can
    public static boolean isPalindrome(String str){
        if(str.isEmpty()){
            return true;
        }
        for(int i = 0; i<(str.length()/2)+1; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    /*
        Runtime:    4 ms
        Memory:     45.9 MB
    * */
    public static String longPal(String str){
        String longestPal = "";
        // pick through each char, start at 1
        for( int i = 0; i <str.length(); i++){
            char currChar = str.charAt(i);
            int leftBound = i-1;
            int rightBound = i+1;
            // Check Duplicate Letters
            while(rightBound < str.length() && currChar == str.charAt(rightBound)){
                rightBound++;
                i++;
            }
            // Move left and right as much as you ca
            // Check Bounds
            while(leftBound >= 0 &&
                    rightBound < str.length() &&
                    str.charAt(rightBound) == str.charAt(leftBound)
            ){
                rightBound +=1;
                leftBound -=1;
            }

            String longPal = str.substring(leftBound+1, rightBound);
            if(longPal.length() > longestPal.length()){
                longestPal = longPal;
            }
        }
        return longestPal;
    }
}
