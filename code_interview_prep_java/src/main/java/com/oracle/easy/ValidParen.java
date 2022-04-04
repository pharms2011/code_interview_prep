package com.oracle.easy;

import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ValidParen {

    /*
        Runtime: 3 ms, faster than 51.49% of Java online submissions for Valid Parentheses.
        Memory Usage: 42.7 MB, less than 8.99% of Java online submissions for Valid Parentheses.
    * */
    public static boolean isValid(String s) {
        // The String only has parens in it, left parent and right parent
        // ([]{()}) Would be valid
        // {}{]} {((}))would be invalid
        // as we travel from left to right, we need to check if we are getting a sart paren or an end paren
        // if it's a start paren, the next end paren must the next end paren
        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(isStart(curr)){
                stack.push(curr);
            }
            else{
                char startParen = stack.pop();
                if(!(endMatch(startParen)==curr)){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isStart(char c){
        if(c == '(' || c=='{' || c == '['){
            return true;
        }
        return false;
    }

    public static char endMatch(char c){
        switch(c){
            case('('):
                return ')';
            case('{'):
                return '}';
            case('['):
                return ']';
        }
        return ' ';
    }
}
