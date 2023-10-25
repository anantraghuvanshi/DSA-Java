package com.javapractice.anant.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/find-target-indices-after-sorting-array/
public class FindTargetAfterSorting {
    public static void main(String[] args) {

    }
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        int end = target;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) ans.add(nums[mid]);
            if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        Collections.sort(ans);
        return ans;
    }
}
