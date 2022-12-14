package org.slidingWindow.challenge4;

import java.util.HashMap;

public class LongestSubstringKDistinct {
    private static int findLength(String str, int k) {

        int windowStart = 0, maxLength = 0;

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar,charFrequencyMap.getOrDefault(rightChar,0) + 1);

            while (charFrequencyMap.size() > k){
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar,charFrequencyMap.get(leftChar)-1);

                if(charFrequencyMap.get(leftChar) == 0){
                    charFrequencyMap.remove(leftChar);
                }
            windowStart++;
            }
             maxLength = Math.max(maxLength, windowEnd - windowStart + 1);


        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
    }


}
