package algo;

import java.util.ArrayList;
import java.util.List;

public class DynamicProgramming {

    public static class MaxSubArray{

        /*
        * Runtime: 2 ms, faster than 61.25% of Java online submissions for Maximum Subarray.
        * Memory Usage: 75.5 MB, less than 19.67% of Java online submissions for Maximum Subarray.
        * */
        public static int maxSubArray(int[] nums){
            int sum=0;
            int max=Integer.MIN_VALUE;

            for(int i = 0; i<nums.length; i++){
                sum += nums[i];
                max = Math.max(sum, max);

                if(sum<0){
                    sum = 0;
                }
            }
            return max;
        }
    }

    /**
     * Runtime: 3 ms, faster than 41.04% of Java online submissions for Generate Parentheses.
     * Memory Usage: 43.8 MB, less than 50.47% of Java online submissions for Generate
     */
    public static class GenerateParen{
        //Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
        public static List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<String>();
            // The length of all Strings will be twice the length of the number of parens
            backtrack(list, "", 0, 0, n*2);
            return list;
        }

        public static void backtrack(List<String> list, String str, int open, int close, int max){
            // Once a String is the appropriate length,we can add it to the list
            if(str.length() == max){
                list.add(str);
                return;
            }
            // If the number of open brackets is less than half the max, we can add an open bracket
            if(open < max/2)
                backtrack(list, str+"(", open+1, close, max/2);
            // If we have fewer close brackets tan open brackets, we can add a closed bracket
            // If we do not, we cannot add a close bracket
            if(close < open)
                backtrack(list, str+")", open, close+1, max/2);
        }
    }
}
