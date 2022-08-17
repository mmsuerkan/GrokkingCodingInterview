package org.example.challange3;

public class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {

        int n = arr.length;
        int lengthOfSmallestSubarray = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < n; windowEnd++) {

             windowSum += arr[windowEnd];

             while(windowSum >= S){
                 lengthOfSmallestSubarray = Math.min(lengthOfSmallestSubarray,windowEnd - windowStart + 1);
                 windowSum -= arr[windowStart];
                 windowStart++;
             }
        }

        return lengthOfSmallestSubarray == Integer.MAX_VALUE ? 0 : lengthOfSmallestSubarray;

    }

    public static void main(String[] args) {
        int result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 2, 1, 5, 2, 3, 2});
        System.out.println("Smallest subarray length: " + result);
    }
}
