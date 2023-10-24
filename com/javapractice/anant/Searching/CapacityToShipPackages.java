package com.javapractice.anant.Searching;

import java.util.Arrays;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShipPackages {
    public static void main(String[] args) {

    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                daysNeeded++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }

        return daysNeeded <= days;
    }
}
