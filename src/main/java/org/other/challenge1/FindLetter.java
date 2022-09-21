package org.other.challenge1;

import java.util.HashMap;

public class FindLetter {

    private static char find(String word) {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            frequencyMap.put(character,frequencyMap.getOrDefault(character,0) + 1);
        }
        for (int i = 0; i < word.length(); i++) {
            if(frequencyMap.get(word.charAt(i)) == 1){
                return word.charAt(i);
            }
        }
        return 'x';
    }

    public static void main(String[] args) {
        char letter = FindLetter.find("issismsippi");
        System.out.println("Tekrar etmeyen harf : " + letter);
    }




}
