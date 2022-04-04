package com.google.medium;

import java.util.*;

public class ThreeSum {
    /*
        Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j
        != k, and nums[i] + nums[j] + nums[k] == 0.

        Notice that the solution set must not contain duplicate triplets.
    * */

    /*
        Input: nums = [-1,0,1,2,-1,-4]
        nums=[-4,-1,-1,-2,-2,0,1,2,4,4,5,7]
        curr = -4
        l =-1
        r = 7
        sum = 2
        Output: [[-1,-1,2],[-1,0,1]]
    * */
    /*
        Runtime: 1009 ms, faster than 9.45% of Java online submissions for 3Sum.
        Memory Usage: 119.2 MB, less than 20.62% of Java online submissions for 3Sum.
    * */
    public static List<List<Integer>> threeSum(int[] nums) {
        List results = new ArrayList();
        Set<String> computedTrilpes = new HashSet();
        Arrays.sort(nums);

        for(int i = 0; i< nums.length; i++){
            int currNum = nums[i];
            int l = i+1;
            int r = nums.length -1;
            while(l<r){
                int sum = currNum + nums[l] + nums[r];

                if(sum > 0){
                    r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    if(computedTrilpes.contains(nums[i]+","+nums[l]+","+nums[r])){
                        break;
                    }
                    List values = new ArrayList();
                    values.add(nums[i]);
                    values.add(nums[l]);
                    values.add(nums[r]);
                    results.add(values);
                    computedTrilpes.add(nums[i]+","+nums[l]+","+nums[r]);
                    break;
                }
            }

        }
        return results;
    }
}
