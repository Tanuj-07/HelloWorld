package com.apcs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class decToBinary {

    public static void main(String[] args) {
        List<Integer> binary = new ArrayList<>();
        int num = 2;
        num = Math.abs(num);
        int x = num;
        while(num > 0){
            binary.add(num%2);
            num = num/2;

        }


        if(num == 0){
            binary.add(0);
        }
        Collections.reverse(binary);
        System.out.println("original number was " + x +", binary is " +binary);
//        String str = (binary).stream()
//                .map(Object::toString)
//                .collect(Collectors.joining(""));
//        System.out.println(str);



        List<Integer> powers = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < binary.size(); i++){
            powers.add((int) Math.pow(2, i)); // type-casting
        }
        Collections.reverse(powers);
        for(int i = 0; i < powers.size(); i++){
            if(binary.get(i) == 1){
                total = total+powers.get(i);
            }


        }
        System.out.println("powers of 2: " +powers);
        System.out.println("reconversion: " + total);



    }


}

