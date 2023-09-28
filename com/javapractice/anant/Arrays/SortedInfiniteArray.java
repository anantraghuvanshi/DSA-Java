package com.javapractice.anant.Arrays;

//Find position of an element in a sorted infinite array
public class SortedInfiniteArray {

    public static void main(String[] args) {

    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > end){
            int newStart = end + 1;
            end = end + (end - start + 1) *2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

//    static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = (arr.length - 1);
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
}
