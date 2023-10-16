package com.javapractice.anant.Searching;

public class BinarySearch2dArray {

    public static void main(String[] args) {

    }

    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
