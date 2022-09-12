package org.cyclicSort.challenge3;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {

    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();

        int i = 0;
        while (i < nums.length){

            if(nums[i]< nums.length && nums[i] != nums[nums[i] -1]){
                swap(nums,i,nums[i] -1);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j+1 != nums[j]){
                missingNumbers.add(j + 1);
            }
        }




        return missingNumbers;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        List<Integer> missing = AllMissingNumbers.findNumbers(new int[] { 2, 3, 1, 8, 2, 3, 5, 1 });
        System.out.println("Missing numbers: " + missing);

        missing = AllMissingNumbers.findNumbers(new int[] { 2, 4, 1, 2 });
        System.out.println("Missing numbers: " + missing);

        missing = AllMissingNumbers.findNumbers(new int[] { 2, 3, 2, 1 });
        System.out.println("Missing numbers: " + missing);
    }

}
