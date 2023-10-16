package com.javapractice.anant.Searching;

public class PeakInMountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        int mid = start + (end-start)/2;
        while(start < end){
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else  {
                start = mid + 1;
            }
        }
        return start;
    }
}
