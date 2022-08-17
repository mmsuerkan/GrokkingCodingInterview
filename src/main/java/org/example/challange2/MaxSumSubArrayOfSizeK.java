package org.example.challange2;

public class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {

        int maxSum = 0;



        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if(sum >= maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}