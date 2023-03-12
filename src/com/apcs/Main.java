package com.apcs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "I want I thalipeeth want because want I am hungry hungry";
        String[] words = str.split("\\s");
        System.out.println(Arrays.toString(words));
        // Creating an empty HashMap
        Map<String, Integer> WordCount
                = new HashMap<>();
        for (String word : words) {
            int count = 1;
            //Check if word is in map
            if(WordCount.containsKey(word)){
                count += WordCount.get(word);

            }
            WordCount.put(word, count);

        }
        System.out.println(WordCount);
    }

}