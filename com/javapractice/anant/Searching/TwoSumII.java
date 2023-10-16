package com.javapractice.anant.Searching;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {6,8,12,18,20};
        System.out.println(Arrays.toString(twoSum(arr,20)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start  = 0 ;
        int end = numbers.length-1;
        while(start<end){
            if(numbers[start] + numbers[end] == target)
                return new int[]{start+1, end+1};
            if(numbers[start] + numbers[end] < target) start++;
            else end--;
        } return new int[]{0,0};
    }
}
