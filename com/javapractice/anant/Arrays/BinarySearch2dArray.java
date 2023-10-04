package com.javapractice.anant.Arrays;

public class BinarySearch2dArray {

    public static void main(String[] args) {

    }

    public static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
