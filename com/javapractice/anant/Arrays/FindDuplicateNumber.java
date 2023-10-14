package com.javapractice.anant.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return actualSum - expectedSum;

//        Using Bit Manipulation
//        int n = nums.length - 1;
//        int xorResult = 0;
//
//        // XOR all numbers in the array
//        for (int num : nums) {
//            xorResult ^= num;
//        }
//
//        // XOR with all numbers from 1 to n
//        for (int i = 1; i <= n; i++) {
//            xorResult ^= i;
//        }
//
//        return xorResult;

        //Using two pointer(slow and fast)
//        int tortoise = nums[0];
//        int hare = nums[0];
//
//        do {
//            tortoise = nums[tortoise];
//            hare = nums[nums[hare]];
//        } while (tortoise != hare);
//
//        // Phase 2: Finding the starting point of the cycle (duplicate number)
//        hare = nums[0];
//        while (tortoise != hare) {
//            tortoise = nums[tortoise];
//            hare = nums[hare];
//        }
//
//        return hare;
    }


}
