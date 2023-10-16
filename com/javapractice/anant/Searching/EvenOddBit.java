package com.javapractice.anant.Searching;

public class EvenOddBit {

    public static void main(String[] args) {
        int n = 17;
        int[] result = evenOddBit(n);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] evenOddBit(int n) {
        String binary = Integer.toBinaryString(n);
        int length = binary.length();
        int countEven = 0;
        int countOdd = 0;

        for (int i = length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                if ((length - 1 - i) % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }
        return new int[]{countEven, countOdd};
    }
}
