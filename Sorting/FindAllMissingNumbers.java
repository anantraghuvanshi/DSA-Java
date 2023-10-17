package Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllMissingNumbers {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i =0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]) swap(nums, i, correct);
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
