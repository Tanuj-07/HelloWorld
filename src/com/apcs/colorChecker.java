package com.apcs;

import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;


public class colorChecker {
    public static void main(String[] args) throws AWTException {
        Robot rob = new Robot();
// 60 && red < 90 && blue > 90 && blue > 55 && green > 48 && green < 55
        boolean cont = true;
        Color color = rob.getPixelColor(960, 540);

        while(cont){

            color = rob.getPixelColor(960, 540  );
            //rob.delay(100);
            int red = color.getRed();
            int blue = color.getBlue();
            int green = color.getGreen();
            if(red > 180 && blue > 40  && green > 40 && blue<140 && green < 140 ){
                rob.keyPress(KeyEvent.VK_U);
                rob.delay(10);
                rob.keyRelease(KeyEvent.VK_U);
            }
        }
//        while(true){
//            rob.delay(1000);
//            color = rob.getPixelColor(960, 540);
//        System.out.println("red: " + color.getRed());
//        System.out.println("blue: " + color.getBlue());
//        System.out.println("green: " + color.getGreen());
//        }

    }
}
