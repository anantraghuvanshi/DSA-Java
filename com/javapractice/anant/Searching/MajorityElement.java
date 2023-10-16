package com.javapractice.anant.Searching;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int num1 = nums[0], num2 = nums[0], count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == num1) {
                count1++;
                continue;
            }

            if (num == num2) {
                count2++;
                continue;
            }

            if (count1 == 0) {
                num1 = num;
                count1++;
                continue;
            }

            if (count2 == 0) {
                num2 = num;
                count2++;
                continue;
            }

            count1--;
            count2--;
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == num1) count1++;
            if (num == num2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(num1);
        if (count2 > nums.length / 3 && num1 != num2) result.add(num2);

        return result;
    }

}
