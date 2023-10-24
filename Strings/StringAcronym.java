package Strings;
import java.util.List;
//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
public class StringAcronym {
    public static void main(String[] args) {

    }
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();
        for ( String word: words) {
            str.append(word.charAt(0));
        }
        return str.toString().toLowerCase().equals(s.toLowerCase());
    }
}
