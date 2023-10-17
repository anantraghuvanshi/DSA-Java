package Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicates {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i =0;
        while(i< nums.length){
            if(nums[i]<nums.length && nums[i] != nums[nums[i]]) swap(nums, i, nums[i]);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) ans.add(nums[j]);
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
