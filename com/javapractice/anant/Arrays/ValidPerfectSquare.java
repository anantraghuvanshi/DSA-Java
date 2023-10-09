package com.javapractice.anant.Arrays;

public class ValidPerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        if(num ==0)return false;
        if(num ==1) return true;
        int i = 1;
        int j = num;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(mid == num / mid) return true;
            else if(mid < num / mid && num % mid ==0) i = mid + 1;
            else j = mid - 1;
        }
        return false;
    }
}
