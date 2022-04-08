package challenge.daily;

import java.util.Arrays;
import java.util.PriorityQueue;

class KthLargest {



    /*
    Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted
    order, not the kth distinct element.

    Implement KthLargest class:

    KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
    int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element
    in the stream.

    * */
    int kth;

    PriorityQueue<Integer> minHeap;

    /*
    * Runtime: 20 ms, faster than 56.53% of Java online submissions for Kth Largest Element in a Stream.
    * Memory Usage: 52.2 MB, less than 71.88% of Java online submissions for Kth Largest Element in a Stream.
    * 04-08-22
    * */
    public KthLargest(int k, int[] nums) {
        PriorityQueue minHeap = new PriorityQueue();
        this.kth = k;
        for(int i: nums){
            minHeap.add(i);
        }
        while(minHeap.size()> k){
            minHeap.remove();
        }
        this.minHeap = minHeap;
    }

    public int add(int val) {
        if(val > this.minHeap.peek()){
            minHeap.add(val);
            minHeap.remove();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */