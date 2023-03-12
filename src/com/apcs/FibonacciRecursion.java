package com.apcs;

public class FibonacciRecursion {

    private static final int MAX = 5;


    private static void fibRecursive (int a, int b, int countSoFar){
        // break the recursion
        if ( countSoFar >= MAX )
            return;

        countSoFar+=1;

        System.out.println(a+b);

        fibRecursive(b, a+b, countSoFar);
    }

    public static void main(String[] args){
        System.out.println(1);
        System.out.println(1);
        fibRecursive(1, 1, 2);
    }
}
