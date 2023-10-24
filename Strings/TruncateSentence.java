package Strings;

//https://leetcode.com/problems/truncate-sentence/
public class TruncateSentence {
    public static void main(String[] args) {

    }
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++) {
            sb.append(words[i]);
            if(i < k - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
