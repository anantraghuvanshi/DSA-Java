package com.javapractice.anant.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i <10 ; i++) {
            i+=sum;
            if (i % 2 == 0) count++;
        }
        if(sum>50){
            System.out.println("High");
        }else System.out.println("Low");
        System.out.println(count);
    }
}
