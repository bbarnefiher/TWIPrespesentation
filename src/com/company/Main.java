package com.company;


import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {

    Scanner stringReader = new Scanner(System.in);
    System.out.println("Enter your phrase to be encrypted:");
    String userPhrase = stringReader.nextLine();

    //double startingPoint = Math.ceil(Math.random()*5);



        Integer userphraseASCII[] = new Integer[userPhrase.length()];
        userphraseASCII[0] = 0;
        for (int i = 0; i < userPhrase.length(); i++){
            char currentChar = userPhrase.charAt(i);
            int ASCIIchar = (int) currentChar;
            userphraseASCII[i] = ASCIIchar;

        }
      //  System.out.println(Arrays.toString(userphraseASCII));

        //changes each character in array to be its ASCII code
        String[] userEncrypted = new String[userPhrase.length()];


        double randPercent = Math.random();
        int startingLetter = userPhrase.length();
        int startingPosition = (int)(startingLetter * randPercent);
      //  System.out.println("starting letter position:" + startingPosition);





            for (int i = 0; i < userPhrase.length(); i++){
                if (startingPosition % 5 == 0){
                    userEncrypted[i] = Integer.toBinaryString(userphraseASCII[i]);

                }
                else if (startingPosition % 5 == 1){
                    userEncrypted[i] = Integer.toOctalString(userphraseASCII[i]);
                }
                else if (startingPosition % 5 == 2){
                    //decimal: operation already performed
                    int tempInt = userphraseASCII[i];
                    String tempString = String.valueOf(tempInt);
                    userEncrypted[i] = tempString;
                }
                else if (startingPosition % 5 == 3){
                    userEncrypted[i] = Integer.toHexString(userphraseASCII[i]);
                }
                else if (startingPosition % 5 == 4){
                    userEncrypted[i] = userPhrase.substring(i, i+1);
                }
                startingPosition++;





    }
        System.out.println("Your encrypted message is: " + Arrays.toString(userEncrypted));

    }
}
