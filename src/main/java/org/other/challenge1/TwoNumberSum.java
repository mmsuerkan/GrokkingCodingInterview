package org.other.challenge1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoNumberSum {


    private static List<List<Integer>> find(int[] ints, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            map.put(ints[i], i);
        }

        for (int number :map.keySet()) {
            int key = target - number;
            if (map.get(key) != null) {
                List<Integer> list = new ArrayList<>();
                list.add(map.get(number));
                list.add(map.get(key));
                lists.add(list);
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        System.out.println(TwoNumberSum.find(new int[]{1,2,3,5,9,8,6}, 11));
        System.out.println(TwoNumberSum.find(new int[]{-1,-4,15,-25,8,0,-18}, -10));
    }



}
