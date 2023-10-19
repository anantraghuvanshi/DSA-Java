package Strings;

public class ShuffleString {
    public static void main(String[] args) {

    }
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ans[indices[i]] = c;
        }
        return new String(ans);
    }
}
