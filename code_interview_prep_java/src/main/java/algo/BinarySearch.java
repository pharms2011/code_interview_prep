package algo;

public class BinarySearch {

    public static int[] sort(int[] array){
        int start = 0;
        int end = array.length -1;
        return array;
    }

    /*
    * Runtime: 78 ms, faster than 5.97% of Java online submissions for Missing Element in Sorted Array.
    * Memory Usage: 58.8 MB, less than 23.57% of Java online submissions for Missing Element in Sorted Array.
    * 04-08-22
    * */

    /*
    * Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Element in Sorted Array.
    * Memory Usage: 58 MB, less than 74.66% of Java online submissions for Missing Element in Sorted Array.
    * 04-08-22
    * */

    /*
    * Given an integer array nums which is sorted in ascending order and all of its elements are unique and given also
    * an integer k, return the kth missing number starting from the leftmost number of the array.
    * */
        public static int missingElement(int[] nums, int k) {
            int count = 0;
            int start = 0;
            int end = nums.length -1;
            int totalMissing = numMissing(nums, start, end);
            if( totalMissing< k){
                return k-totalMissing + nums[end];
            }

            while(end-start > 1){
                    int mid = start + (end-start)/2;
                    int numMissing = numMissing(nums, start, mid);
                    if(count+numMissing >= k){
                        // means there are k or more missing elements in here
                        end = mid;
                    }
                    else{
                        // means there are fewer than k missing from the left
                        start = mid;
                        count += numMissing;
                    }
            }
            return nums[start] + k-count;
        }

        public static int numMissing(int[] nums, int start, int end){
            // [4,7]
            // fifference btwm values
            //minus to length of the arrray
            // diff should be largest number - smallest number -1
            return (nums[end] - nums[start]) - (end-start);
        }

//    public int missingElement(int[] nums, int k) {
//        //First Element
//        int start = nums[0];
//        //Last Element
//        int end = nums[nums.length -1];
//        int curr = 0;
//        int counter = k;
//        for(int i = start; i< end; i++){
//            if(nums[curr]!=i){
//                counter --;
//            }
//            else{
//                counter++;
//            }
//            if(counter == 0){
//                return i;
//            }
//        }
//        return end+counter;
//    }
}
