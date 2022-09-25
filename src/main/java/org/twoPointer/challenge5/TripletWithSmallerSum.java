package org.twoPointer.challenge5;

import java.util.Arrays;

class TripletWithSmallerSum {

    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length -2; i++) {
            int number1 = arr[i];
            count += searchPair(arr, target - number1, i+1);
        }

        return count;
    }

    private static int searchPair(int[] arr, int difference, int index) {
        int count = 0;
        int left = index;
        int right = arr.length -1;
        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum < difference) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(TripletWithSmallerSumBetter.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }
}
