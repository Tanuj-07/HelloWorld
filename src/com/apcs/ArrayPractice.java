package com.apcs;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i = 0; i < nums.length;i++){
            nums[i] = i+1;
        }
        int[] numsCopy = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            numsCopy[i] = nums[i];
        }

        for(int i : nums){
            System.out.println(i);
        }
        System.out.println("");

        for(int i : numsCopy){
            System.out.println(i);
        }

        int[] numsCombine = new int[nums.length + numsCopy.length];
        for(int i = 0; i < nums.length; i++){
            numsCombine[i] = nums[i];
        }
        for(int i = nums.length; i < numsCombine.length; i++){
            numsCombine[i] = numsCopy[i-nums.length];
        }
        System.out.println("");
        for(int i : numsCombine){
            System.out.print(i+ " ");
        }
        System.out.println("");
        int find = 5;
        for(int i = 0; i < numsCombine.length; i++){
            if(numsCombine[i] == find){
                System.out.println("the first index of " + find + " is " + i);
                break;
            }
        }
        System.out.println("");
        int max = numsCombine[0];
        int min = numsCombine[0];

        for(int i = 1; i < numsCombine.length; i++){
            if(numsCombine[i] > max){
                max = numsCombine[i];
            }
            if(numsCombine[i] < min){
                min = numsCombine[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println("");
        int sum = 0;
        for(int num : numsCombine){
            sum = sum+ num;
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum/numsCombine.length);
        System.out.println("");

        int remove = 2; // this is the index to be removed
        boolean minus1= false;
        int[] newNums = new int[numsCombine.length-1];
        // i is for numsCombine (orig array to remove ele from) and j is for newNums (target array)
        for(int i = 0,j=0; j < newNums.length; i++){
            if(i == remove){
                continue;
            }
            newNums[j] = numsCombine[i];
            j++;
        }
        System.out.println("new array:");
        System.out.println(Arrays.toString(newNums));

//        for(int i : newNums){
//            System.out.println(i);
//        }


    }
}
