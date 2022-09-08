package org.twoPointer.challenge3;

public class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        int highestSquareIdx = n - 1;
        int left = 0, right = arr.length - 1;

        while (left <= right){
            int leftSquares = arr[left] * arr[left];
            int rightSqares = arr[right] * arr[right];

            if(leftSquares > rightSqares){
                squares[highestSquareIdx--] = leftSquares;
                left++;
            }else{
                squares[highestSquareIdx--] = rightSqares;
                right--;
            }
        }
        return squares;
    }
    public static void main(String[] args) {

        int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();

        result = SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 });
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();
    }



}
