package Strings;

//https://leetcode.com/problems/count-asterisks/
public class CountAsterisks {
    public static void main(String[] args) {

    }
    public int countAsterisks(String s) {
        int ans = 0;
        boolean isInside = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '|') isInside = !isInside;
            else if (c == '*' && !isInside) {
                ans++;
            }
        }
        return ans;
    }
}
