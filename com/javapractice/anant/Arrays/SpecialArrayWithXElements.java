package com.javapractice.anant.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArrayWithXElements {
    public static void main(String[] args) {

    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        if(nums[0] >= n) {
            return n;
        }
        int left = 0, right = n - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int countGreater = n - mid;

            if(countGreater > nums[mid]) {
                left = mid + 1;
            } else if(mid > 0 && countGreater > nums[mid - 1]) {
                return countGreater;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
