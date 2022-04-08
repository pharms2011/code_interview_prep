package challenge.daily;

public class LastStoneWeight {

    /*
    * Runtime: 1 ms, faster than 98.64% of Java online submissions for Last Stone Weight.
    * Memory Usage: 41.7 MB, less than 47.73% of Java online submissions for Last Stone
    * 04-07-22
    * */
    public int lastStoneWeight(int[] stones) {
        int remStoneAmt = stones.length;
        int[] remStones = stones;
        while(remStoneAmt > 1){
            int largetStone = findAndRemoveLargest(stones);
            int secondLargest = findAndRemoveLargest(stones);
            if(largetStone != secondLargest){
                remStoneAmt -=1;
                replaceStone(stones, largetStone-secondLargest);
            }
            else{
                remStoneAmt -=2;
            }
        }
        for(int stone: remStones){
            if(stone != Integer.MIN_VALUE){
                return stone;
            }
        }
        return 0;
    }
    public int findAndRemoveLargest(int[] nums){
        int largestIndex = 0;
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(nums[i] >largest){
                largest = nums[i];
                largestIndex = i;
            }
        }
        nums[largestIndex] = Integer.MIN_VALUE;
        return largest;
    }

    public void replaceStone(int[] stones, int stone){
        for(int i =0; i<stones.length; i++){
            if(stones[i]==Integer.MIN_VALUE){
                stones[i] =stone;
                return;
            }
        }
    }
}
