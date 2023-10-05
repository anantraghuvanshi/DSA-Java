package com.javapractice.anant.Arrays;

public class SquareRoot {
    public static void main(String[] args) {

    }

    static int sqrt(int x) {
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0) {
                return 0;
            }
            if (mid == x / mid) { // this way because mid * mid can exceed integer limit
                return mid;
            } else if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

}
