package com.javapractice.anant.Arrays;

//https://leetcode.com/problems/arranging-coins/description/

public class ArrangeCoins {
    public static void main(String[] args) {

    }
    public int arrangeCoins(int n) {
//        int remainingCoins = n;
//        int currentRow = 1;
//
//        while (remainingCoins >= currentRow) {
//            remainingCoins -= currentRow;
//            currentRow++;
//        }
//
//        return currentRow - 1;
//    }
    //using binary search

        long start = 0;
        long end = n;
        while(start <= end) {
            long mid =  start + (end-start)/2;
            long total = mid * (mid + 1) / 2;
            if (total == n) return (int) mid;
            if (total < n) start = mid + 1;
            else end = mid - 1;
        }

        return (int) end;
        }
}
