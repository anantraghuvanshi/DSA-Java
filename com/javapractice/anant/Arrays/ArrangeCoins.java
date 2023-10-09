package com.javapractice.anant.Arrays;

//https://leetcode.com/problems/arranging-coins/description/

public class ArrangeCoins {
    public static void main(String[] args) {

    }
    public int arrangeCoins(int n) {
        int remainingCoins = n;
        int currentRow = 1;

        while (remainingCoins >= currentRow) {
            remainingCoins -= currentRow;
            currentRow++;
        }

        return currentRow - 1;
    }
}
