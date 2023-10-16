package com.javapractice.anant.Searching;

public class RichestCustomer {

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if(sum> ans){
                ans = sum;
            }
        }

        return ans;
    }
}
