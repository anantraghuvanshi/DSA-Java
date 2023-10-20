package Strings;

//https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
public class MaxValueofString {
    public static void main(String[] args) {

    }
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            if (str.matches("\\d+")) {
                max = Math.max(max, Integer.parseInt(str));
            } else {
                max = Math.max(max, str.length());
            }
        }
        return max;
    }

}
