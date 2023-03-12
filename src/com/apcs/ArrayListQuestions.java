package com.apcs;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQuestions {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
       //System.out.println("Before " + nums);
//        for(int i = nums.size(); i >= 1; i--){
//            if(nums.get(i-1) % 2 != 0){
//                nums.add(i,nums.get(i-1)+1);
//            }
//        }

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) % 2 != 0){
                nums.add(i+1, nums.get(i)+1);
            }
        }
       // System.out.println("after " + nums);

        int[] numbers = {1,2,3,4,5};
        int temp;
        int j = numbers.length-1;
        int[] reverse = new int[numbers.length];
        for(int i = 0; i < numbers.length/2; i++){
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j--;

        }
        System.out.println("after reverse " + Arrays.toString(numbers));


    }
    public ArrayList<Integer> returnList(ArrayList<Integer> arr){
        arr = new ArrayList<>(3);
        ArrayList arr2 =  new ArrayList(56);
        ArrayList<Integer> arr3 = new ArrayList<>(8);
        return arr;
    }

}
