package com.apcs;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class NumParts {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(1000);

        int[] primeList = new int []{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        System.out.println("Find factors for " + num);
        List<Integer> factorList = new ArrayList<>();
        if (num == 0){
            System.out.println("0 cannot be factored");
            System.exit(-1);
        }

        for (int i : primeList ){
            while( num%i == 0 ){
                System.out.println("Found factor " + i + " num will go from " + num + " to " + num/i);
                num = num /i;
                factorList.add(i);
            }
        }
        if (num > 31 ){
            factorList.add(num);
        }
        System.out.println("factors are " + factorList);
    }
}
