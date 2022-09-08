package org.twoPointer.challange1;

import java.util.HashMap;
import java.util.Map;

public class PairWithTargetSumBetter {


    public static int[] search(int[] arr, int targetSum) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            int key = targetSum - element;

            if(map.containsKey(key)){
                return new int[] { map.get(key), i };
            }

            map.put(element,i);
        }


        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] result = PairWithTargetSumBetter.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = PairWithTargetSumBetter.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
}