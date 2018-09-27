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
        for (int i = 0; i < userPhrase.length(); i++){
            char currentChar = userPhrase.charAt(i);
            int ASCIIchar = (int) currentChar;
            userphraseASCII[i] = ASCIIchar;

        }
        System.out.println(Arrays.toString(userphraseASCII));

        //changes each character in array to be its ASCII code
        String[] userEncrypted = new String[userPhrase.length()];

    int encryptFinish = 0;
        String endingChar = userPhrase.substring(userPhrase.length()-1, userPhrase.length());
        System.out.println(endingChar);
        //sets parameters for future while loops
    if (startingPoint == 1.0) { //binary

        while (encryptFinish == 0){

            System.out.println("while loop is running...");

            for (int i = 0; i < userPhrase.length(); i++){
                if (i % 5 == 0){
                    //userEncrypted[i] = userphraseASCII[i].toBinaryString();
                }
                else if (i % 5 == 1){

                }
                else if (i % 5 == 2){

                }
                else if (i % 5 == 3){

                }
                else if (i % 5 == 4){

                }
            }


            if (!(userEncrypted[userPhrase.length()-1].equals(endingChar))){
                encryptFinish = 1;
            }
        }
    }
        System.out.println("while loop over");
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
