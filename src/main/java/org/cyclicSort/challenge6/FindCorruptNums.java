package org.cyclicSort.challenge6;

public class FindCorruptNums {

    private static int[] findNumbers(int[] nums) {

        FindCorruptNums.sort(nums);

        for(int i = 0;i< nums.length;i++){
            if(nums[i] != i +1){
                return new int[] {nums[i],i + 1};
            }
        }

        return new int[] { -1, -1 };
    }

    private static int[] sort(int[] nums) {
      int i = 0;
      while (i < nums.length){

          if(nums[i] != nums[nums[i] - 1]){
              swap(nums,i,nums[i] - 1);
          }else{
              i++;
          }
      }
      return nums;
     }


    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2, 5, 2 };
        int[] result = findNumbers(nums);
        System.out.println(result[0] + " is duplicated, " + result[1] + " is missing");
//        nums = new int[] { 3, 1, 2, 3, 6, 4 };
//        result = findNumbers(nums);
//        System.out.println(result[0] + ", " + result[1]);
    }


}
