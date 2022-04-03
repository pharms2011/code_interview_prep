package com.google.easy;

import java.util.HashMap;

public class TwoSum {

    /*
        Runtime:    4 ms
        Memory:     45.9 MB
    * */
    public static int[] twoSum(int[] nums, int target) {
        /* This is the linearly timed algorithm, the space complexity is only around 2n
        * */
        HashMap<Integer, Integer> processesNumbers = new HashMap();

        for(int i=0; i<nums.length; i++){
            int remainingValue = target - nums[i];
            if(processesNumbers.containsKey(remainingValue)){
                return new int[] {processesNumbers.get(remainingValue), i};
            }
            processesNumbers.put(nums[i], i);
        }
        return null;
    }
}
