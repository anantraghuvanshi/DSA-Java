package Strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
public class ConcatenationEqualTarget {
    public static void main(String[] args) {

    }
    public int numOfPairs(String[] nums, String target) {
        //brute force
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j< nums.length; j++) {
//                if ( i!=j && (nums[i] + nums[j] ).equals(target)) count++;
//            }
//        }
//        return count;
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (String num : nums) {
            String complement = target.startsWith(num) ? target.substring(num.length()) : target.substring(0, target.length() - num.length());
            if (map.containsKey(complement)) {
                count += map.get(complement);
                if (num.equals(complement)) count--;
            }
        }
        return count / 2;
    }
}
