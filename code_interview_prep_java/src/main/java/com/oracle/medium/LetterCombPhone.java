package com.oracle.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombPhone {

    /*
        Runtime: 7 ms, faster than 32.64% of Java online submissions for Letter Combinations of a Phone Number.
        Memory Usage: 43.5 MB, less than 7.43% of Java online submissions for Letter Combinations of a Phone Number.
    * */
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList();
        List<char[]> options = new ArrayList();
        for(int i=0; i<digits.length(); i++){
            options.add(letterOtions(digits.charAt(i)));
        }
        for(char c: options.get(0)){
            results.add(c+"");
        }
        for(int i=1; i<options.size(); i++){
            results = combineOptions(results,options.get(i));
        }

        return results;
    }

    public char[] letterOtions(char c){
        Map<Character, char[]> options = new HashMap();
        options.put('2', new  char[]{'a','b', 'c'});
        options.put('3', new  char[]{'d','e', 'f'});
        options.put('4', new  char[]{'g','h', 'i'});
        options.put('5', new  char[]{'j','k', 'l'});
        options.put('6', new  char[]{'m','n', 'o'});
        options.put('7', new  char[]{'p','q', 'r', 's'});
        options.put('8', new  char[]{'t','u', 'v'});
        options.put('9', new  char[]{'w','x', 'y', 'z'});
        return options.get(c);
    }
    public List<String> combineOptions(List<String> a, char[] b){
        List<String> results = new ArrayList();
        for(String s: a){
            for(char c: b){
                results.add(s+c);
            }
        }
        return results;
    }
}
