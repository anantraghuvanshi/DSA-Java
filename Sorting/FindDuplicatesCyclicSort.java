package Sorting;

public class FindDuplicatesCyclicSort {
    public static void main(String[] args) {

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public int findDuplicate(int[] nums){
        int i =0;
        while(i< nums.length){
            if(nums[i] != i+1){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]) swap(nums, i, correct);
                else return nums[i];
            }
        } return -1;
    }
}
