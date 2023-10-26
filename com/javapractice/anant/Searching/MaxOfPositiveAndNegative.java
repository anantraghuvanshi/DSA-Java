package com.javapractice.anant.Searching;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class MaxOfPositiveAndNegative {
    public static void main(String[] args) {

    }
//    public int maximumCount(int[] nums) {
//        int pos = 0;
//        int neg = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] < 0) neg++;
//            if(nums[i] > 0) pos++;
//        }
//        return Math.max(pos, neg);
//    }

    //Using Binary Search
    public int maximumCount(int[] nums) {
        int idx = firstPositiveIndex(nums);
        return Math.max(nums.length-idx, idx);
    }

    public int firstPositiveIndex(int[] nums) {
        int idx = 0;
        int start = 0;
        int end = nums.length -1 ;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > 0)  end = mid -1;
            if(nums[mid] < 0) start = mid+1;
            else start = mid + 1;
        }
        return start;
    }
}
