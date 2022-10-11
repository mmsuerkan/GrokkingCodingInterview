package org.cyclicSort.challenge6;

public class FindCorruptNums {

    private static int[] findNumbers(int[] nums) {

        FindCorruptNums.sort(nums);

        return new int[] { -1, -1 };
    }

    private static void sort(int[] nums) {

        

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2, 5, 2 };
        int[] result = findNumbers(nums);
        System.out.println(result[0] + ", " + result[1]);
        nums = new int[] { 3, 1, 2, 3, 6, 4 };
        result = findNumbers(nums);
        System.out.println(result[0] + ", " + result[1]);
    }


}
