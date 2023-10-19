package Strings;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
public class MaxNoOfWords {
    public static void main(String[] args) {

    }
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {

            int currentWordCount = sentence.split(" ").length;

            if (currentWordCount > maxWords) {
                maxWords = currentWordCount;
            }
        }
        return maxWords;
    }
}
