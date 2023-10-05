package com.javapractice.anant.Arrays;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) { //if mid is bad version then it means either mid is answer or before that
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
