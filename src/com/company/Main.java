package com.company;
import javafx.util.converter.IntegerStringConverter;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {

    Scanner stringReader = new Scanner(System.in);
    System.out.println("Enter your phrase to be encrypted:");
    String userPhrase = stringReader.nextLine();

    double startingPoint = Math.ceil(Math.random()*5);
    System.out.println(startingPoint);

        //String userPhraseArray[] = new String[userPhrase.length()];

        char[] chars = userPhrase.toCharArray();






       /* for (int i = 0; i < userPhrase.length(); i++){
            //System.out.println(i);
            userPhraseArray[i] = userPhrase.substring(i, i + 1);

        }
        System.out.println(Arrays.toString(userPhraseArray));
        //turns userPhrase into array*/
        Integer userphraseASCII[] = new Integer[userPhrase.length()];
        userphraseASCII[0] = 0;
        for (int i = 0; i < userPhrase.length(); i++){
            char currentChar = userPhrase.charAt(i);
            int ASCIIchar = (int) currentChar;
            userphraseASCII[i] = ASCIIchar;

        }
        System.out.println(Arrays.toString(userphraseASCII));

        //changes each character in array to be its ASCII code
        String[] userEncrypted = new String[userPhrase.length()];

    int encryptFinish = 0;
        //String endingChar = userPhrase.substring(userPhrase.length()-1, userPhrase.length());
        //System.out.println(endingChar);
        //sets parameters for future while loops

        double randPercent = Math.random();
        int startingLetter = userPhrase.length();
        int startingPosition = (int)(startingLetter * randPercent);
        System.out.println("starting at letter position:" + startingPosition);
    if (startingPoint >= 1.0) { //binary

        //while (encryptFinish == 0){


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
           // }


//            if (!(userEncrypted[userPhrase.length()-1].equals(endingChar))){
  //              System.exit(0);
    //            encryptFinish = 1;
      //      }
        }
    }
        System.out.println(Arrays.toString(userEncrypted));
    if (startingPoint == 2.0){ //octal


    }
    if (startingPoint == 3.0){ //decimal

    }
    if (startingPoint == 4.0){ //hex

    }
    if (startingPoint == 5.0){ //ASCII

    }







    }
}
