package Strings;

import java.util.Collections;
import java.util.List;

public class ChoosePairsSumLessThanTarget {
    public static void main(String[] args) {

    }
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0, n = nums.size();

        for (int i = 0; i < n; i++) {
            int j = binarySearch(nums, i, target - nums[i]);
            count += j - i;
        }
        return count;
    }

    private int binarySearch(List<Integer> nums, int start, int val) {
        int left = start, right = nums.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) < val) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums.get(left) >= val) {
            return left - 1;
        }
        return left;
    }

}
