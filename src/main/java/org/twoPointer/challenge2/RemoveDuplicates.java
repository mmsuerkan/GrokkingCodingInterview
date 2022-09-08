package org.twoPointer.challenge2;

import java.util.Arrays;

public class RemoveDuplicates {

    private static int[] remove(int[] arr) {
        int nextNonDuplicate = 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[nextNonDuplicate - 1] != arr[i]){
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
        System.out.println(Arrays.toString(RemoveDuplicates.remove(arr)));

        arr = new int[] { 2, 2, 2, 11 };
        System.out.println(Arrays.toString(RemoveDuplicates.remove(arr)));
    }


}
