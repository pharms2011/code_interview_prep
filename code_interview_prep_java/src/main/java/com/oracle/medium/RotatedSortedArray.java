package com.oracle.medium;

public class RotatedSortedArray {
    // ex. [4,5,6,0,1,2,3], 5
    public static int search(int[] nums, int target) {
        int flux = findInflux(nums);
        int start = 0;
        int end = nums.length-1;
        if(flux == 0){
            return binarySearch(nums, start, end, target);
        }
        else if(target >= nums[start]){
            return binarySearch(nums, start, flux, target);
        }
        else{
            return binarySearch(nums, flux+1, end, target);
        }
    }
    public static int findInflux(int[] nums){
        int start = 0;
        int end = nums.length -1;
        // [4,5,6,0,1,2]
        while(start != end){
            int mid = (start + end)/2;
            if(nums[start] < nums[mid]){
                // The area between is in correct order,
                // the flux pont must be after the mid
                start = mid;
            }
            else{
                // They are between is not in the correct order
                // the flux point must be between them
                end = mid;
            }
        }
        return end;
    }
    //O(log(n))
    public static int binarySearch( int[] nums, int start, int end, int target){
        // [4,5,1,2,3]
        // target=2
        // start = 2
        // end = 4
        // mid = 3
        while(start < end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) {
                // target can only be in the first half
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return nums[end] == target? end: -1;
    }
}
