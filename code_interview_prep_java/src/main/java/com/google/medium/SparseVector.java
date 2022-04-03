package com.google.medium;

/*
Given two sparse vectors, compute their dot product.

Implement class SparseVector:

    SparseVector(nums) Initializes the object with the vector nums
    dotProduct(vec) Compute the dot product between the instance of SparseVector and vec

A sparse vector is a vector that has mostly zero values, you should store the sparse vector efficiently and compute the
dot product between two SparseVector.

Follow up: What if only one of the vectors is sparse?
* */

class SparseVector {

    private int[] nums;

    SparseVector(int[] nums) {
        this.nums = nums;
    }

    int[] getNums(){
        return this.nums;
    }

    /*
    Runtime: 4 ms, faster than 86.66% of Java online submissions for Dot Product of Two Sparse Vectors.
    Memory Usage: 122.2 MB, less than 22.32% of Java online submissions for Dot Product of Two Sparse Vectors.
    */

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int result = 0;
        int[] vecNums = vec.getNums();
        for(int i= 0; i<nums.length; i++){
            result += vecNums[i]*this.nums[i];
        }
        return result;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
