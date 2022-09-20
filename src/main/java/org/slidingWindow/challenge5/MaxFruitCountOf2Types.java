package org.slidingWindow.challenge5;

import java.util.HashMap;

public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {

        int windowStart = 0, maxLength = 0;

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

           charFrequencyMap.put(arr[windowEnd],charFrequencyMap.getOrDefault(arr[windowEnd],0) + 1);

           while (charFrequencyMap.size() > 2){
                charFrequencyMap.put(arr[windowStart],charFrequencyMap.get(arr[windowStart])-1);

                if(charFrequencyMap.get(arr[windowStart]) == 0){
                     charFrequencyMap.remove(arr[windowStart]);
                }
                windowStart++;
            }
           maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }


        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: " +
                MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
        System.out.println("Maximum number of fruits: " +
                MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
    }
}
