package com.javapractice.anant.Arrays;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinimumInRotatedArray {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1 ;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[end]) end = mid;
            else start = mid + 1;
        }
        return nums[start];
    }
}
