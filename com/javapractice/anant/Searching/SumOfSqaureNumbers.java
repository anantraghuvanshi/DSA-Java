package com.javapractice.anant.Searching;

//https://leetcode.com/problems/sum-of-square-numbers/
public class SumOfSqaureNumbers {
    public static void main(String[] args) {

    }
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);

        while(a <= b){
            int sum = a * a + b * b;
            if(sum == c) return true;

            int diff = c - a * a;
            if(isPerfectSquare(diff)) return true;

            if(sum < c) a++;
            else b--;
        }
        return false;
    }

    private boolean isPerfectSquare(int num) {
        int root = (int) Math.sqrt(num);
        return root * root == num;
    }


}
