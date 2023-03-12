package com.apcs;

public class ReverseString {
    private String oldString;

    public ReverseString(String str){
        oldString = str;
    }
    public String reverse(){
        String returnString = "";
        for(int i = oldString.length()-1; i >= 0; i--){
            returnString += oldString.charAt(i);

        }
        return returnString;
    }
    public static void main(String[] args){
        ReverseString str = new ReverseString("enola");
        System.out.println(str.reverse());

    }

}
