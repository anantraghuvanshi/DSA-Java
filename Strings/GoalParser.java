package Strings;

//https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParser {
    public static void main(String[] args) {

    }
    public String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }
}
