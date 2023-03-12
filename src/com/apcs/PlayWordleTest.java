package com.apcs;

import java.util.Scanner;

public class PlayWordleTest
{
    public static void main(String[] args) {
        String[] expected = {   "TRi--",
                "-R-t-",
                "-tAIN",
                "----r",
                "ri--t",
                "TRAIN"  };

        System.out.println("\f");
        Wordle game = new Wordle("TRAIN");
        game.addGuess("TRICK");
        game.addGuess("WROTE");
        game.addGuess("STAIN");
        game.addGuess("UPPER");
        game.addGuess("RIGHT");
        game.addGuess("TRAIN");

        String [] results = game.checkGuesses();

        boolean passed = true;
        System.out.println("Expect\tRecvd\tResult");
        for(int i=0; i<results.length; i++) {
            System.out.print(expected[i] + "\t");
            System.out.print(results[i] + "\t");
            if(expected[i].equals(results[i])) {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
                passed = false;
            }
        }
    }
}