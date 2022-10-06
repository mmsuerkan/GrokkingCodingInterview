package org.dynamicProgramming.challenge1;

import java.util.HashMap;


public class Factorial {
    public static HashMap<Integer, Integer> memoize = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + findFactorial(5));
        System.out.println("Factorial of 8 is: " + findFactorial(8));
        System.out.println("Factorial of 6 is: " + findFactorial(6));
        System.out.println("Factorial of 7 is: " + findFactorial(7));
    }

    private static int findFactorial(int i) {

        if (i == 0) {
            return 1;
        }
        return  memorizedFactorial(i);
    }

    public static int memorizedFactorial(int n) {

        if(n == 0) {
            return 1;
        }

        if(memoize.containsKey(n)) {
            System.out.println("Fetching from memoize for " + n);
            return memoize.get(n);
        }
        int factorial = memorizedFactorial(n -1) * n;
        memoize.put(n, factorial);
        return factorial;
    }

}
