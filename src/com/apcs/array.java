package com.apcs;



public class array {
    public static void main(String[] args) {
        int[][] name  = { {1,2,3},
                          {4,5,6},
                          {7,8,9} };
        int[] array = new int[name.length*name[0].length];
        int index = 0;
        for(int[] arr : name){
            for(int num : arr){
                array[index] = num;
                index++;
            }
        }
        for(int i : array){
            System.out.println(i);
        }
        for (int[] ints : name) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
        }
        int[][] newArr = new int[3][3];
        index = 0;
        for(int row = 0; row< newArr.length; row++){
            for(int col = 0; col < newArr[0].length; col++){
                newArr[row][col] = array[index];
                index++;
            }
        }
        System.out.println();
        for (int[] ints : newArr) {
            for (int col = 0; col < newArr[0].length; col++) {
                System.out.print(ints[col]);
            }
            System.out.println();
        }

    }
}
