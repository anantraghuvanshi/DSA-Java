package com.javapractice.anant.Searching;

//https://leetcode.com/problems/reach-a-number/
public class ReachANumber {
    public static void main(String[] args) {

    }
    public int reachNumber(int target) {
        target = Math.abs(target);
        int moves = 0;
        int total = 0;
        while (true) {
            moves++;
            total += moves;
            if (total >= target && (total - target) % 2 == 0) {
                break;
            }
        }
        return moves;
    }
}
