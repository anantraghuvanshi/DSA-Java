package com.javapractice.anant.Searching;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeIn2dArray {
    public static void main(String[] args) {

    }
    public int countNegatives(int[][] grid) {
        int count = 0;
        int row = 0;
        int col = grid[0].length-1;

        while(row < grid.length && col>=0){
            if (grid[row][col] < 0) {
                count += grid.length - row;
                col--;
            } else {
                row++;
            }
        }
        return count;
    }

}
