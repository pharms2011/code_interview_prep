package com.oracle.medium;

public class RotatedSortedArray {
    // ex. [4,5,6,0,1,2,3], 5
    public static int search(int[] nums, int target) {
        if(nums.length == 0 ){
            return -1;
        }
        if(nums.length ==1){
            return nums[0] == target? 0:-1;
        }
        int flux = findInflux(nums); // this should be the max value
        if(target < nums[0]){
            return binarySearch(nums, flux+1, nums.length -1, target);
        }
        else{
            return binarySearch(nums, 0, flux,target);
        }
    }
    public static int findInflux(int[] nums){
        // I want to find the end of the array

        int start = 0;
        int end = nums.length - 1;

        //[6,1,2,3]
        while(start<end){
            int mid = (end-start)/2 + start;
            //is mid the pivot
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[start] < nums[mid]){
                // array btwn start and mid is in order
                // look in the second half
                start = mid+1;
            }
            else{
                // array btwn start and end is not in order
                // look btwn them for the flux
                end =mid-1;
            }
        }
        return start;
    }
    //O(log(n))
    public static int binarySearch( int[] nums, int start, int end, int target){
        // assuming nums is sorted
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                // the target if it exsists is, is after the mid
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
