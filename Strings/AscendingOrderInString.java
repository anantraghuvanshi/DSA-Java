package Strings;

//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
public class AscendingOrderInString {
    public static void main(String[] args) {

    }
    public boolean areNumbersAscending(String s) {
        int prev = -1;
        String[] token =  s.split(" ");
        for (String string : token) {
            if (string.matches("\\d+")) {
                int current = Integer.parseInt(string);
                if (current > prev) {
                    prev = current;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
