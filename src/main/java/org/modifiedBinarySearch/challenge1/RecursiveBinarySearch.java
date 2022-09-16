package org.modifiedBinarySearch.challenge1;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int search(int[] arr, int key) {
        Arrays.sort(arr);

        return search(arr, 0, arr.length - 1, key);
    }

    public static int search(int[] arr, int lo, int hi, int key) {
       if(lo > hi){
           return -1;
       }

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return search(arr, lo, mid - 1, key);

        } else {
            return search(arr, mid + 1, hi, key);
        }
    }


    public static void main(String[] args) {
        System.out.println(RecursiveBinarySearch.search(new int[]{4, 6, 10}, 10));
        System.out.println(RecursiveBinarySearch.search(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
        System.out.println(RecursiveBinarySearch.search(new int[]{10, 6, 4}, 10));
        System.out.println(RecursiveBinarySearch.search(new int[]{10, 6, 4}, 4));
    }

}
