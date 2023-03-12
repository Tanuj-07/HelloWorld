package com.apcs;
import java.util.ArrayList;
import java.util.Arrays;

public class Wordle {
    private ArrayList<String> guesses = new ArrayList<>();
    private String[] wordArr;

    private String word;

    public Wordle(String w){
        word = w;
        wordArr = new String[w.length()];
        for(int i = 0; i < wordArr.length;i++){
            wordArr[i] = w.substring(i,i+1);
        }
    }

    public void addGuess(String w){
        guesses.add(w);
    }

    public String[] createArray(String w){
        String[] wArr = new String[w.length()];
        for(int i = 0; i < wArr.length;i++){
            wArr[i] = w.substring(i,i+1);
        }
        return wArr;
    }

    public String[] checkGuesses(){
        int guessNum = 0;
         String[] guessArr;
        String[] returnArr = new String[guesses.size()];


        for(int j = 0; j < guesses.size();j++) {
            guessArr = createArray(guesses.get(j));
            System.out.println(Arrays.toString(guessArr));
            String wordToAdd = "";

            for (int i = 0; i < word.length(); i++) {
                String guessChar = guessArr[i];
                String wordChar = wordArr[i];

                System.out.println("guessArr[i]: " + guessArr[i] + " wordArr[i]: " + wordArr[i] + " wordToAdd: " + wordToAdd);

                if (guessChar.equals(wordChar)) {
                    wordToAdd += wordChar.toUpperCase();
                    continue;
                }
                if (word.contains(guessChar)) {
                    wordToAdd += guessChar.toLowerCase();
                    continue;
                }
                if (!word.contains(guessChar)) {
                    wordToAdd += "-";
                }
            }
            returnArr[j] = wordToAdd;

        }
        System.out.println("=============================================");
        return returnArr;

    }
}
