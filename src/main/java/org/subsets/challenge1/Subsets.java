package org.subsets.challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Subsets {

    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        subsets.add(new ArrayList<>());

        for (int currentNumber : nums) {
            int n = subsets.size();

            for (int i = 0; i < n; i++) {
                List<Integer> set = new ArrayList<>(subsets.get(i));
                set.add(currentNumber);
                    subsets.add(set);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
//        List<List<Integer>> result = Subsets.findSubsets(new int[]{1, 3});
//        System.out.println("Here is the list of subsets: " + result);
        int sum = 0;
        List<List<Integer>> result = Subsets.findSubsets(new int[]{1, 5, 3});
        Stream<List<Integer>> listStream = result.stream().filter(list -> list.size() % 2 != 0);
        for (List<Integer> list : listStream.toArray(List[]::new)) {

            for (Integer integer : list) {
                sum += integer;
            }
        }
        System.out.println(sum);
    }

}
