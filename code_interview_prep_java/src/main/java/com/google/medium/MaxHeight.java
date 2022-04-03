package com.google.medium;

public class MaxHeight {
    /*
    *
    *
    *
    *   *                               *
    *   *               *               *
    *   *       *       *               *
    *   *       *       *       *       *
    * */

    /*
        1) create a left pointer, pointing to the first element
           and right pointer pointing to the last element

        2) calculate the area by multiplying the width = (index last element - index first element) with the largest height of the 2 pillars.

        3) move the left pointer 1 forward if the right height is larger
           move the right pointer 1 backwards if the left height is larger.
        */

    /*
        Runtime: 6 ms, faster than 26.88% of Java online submissions for Container With Most Water.
        Memory Usage: 74.5 MB, less than 53.86% of Java online submissions for Container With Most Water.
    * */
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i =0;
        int j = height.length-1;
        while(i<j){
            int area = (j-i) * Math.min(height[j], height[i]);
            maxArea=area>maxArea? area:maxArea;
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}
