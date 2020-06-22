/*
ASHTON HIGGINS STRING CHALLENGE
Set up a keyboard for them to type

Main Method:
Ask how many words they will give us (as integer T)
	Limit it to be between 1-10
Create a for loop controlled by the value of T
	Ask the user for a word
	Find the length of the word
Declare the string= call method(new word)
Print the new word that was sent to me

Return Method:
String even letter
	For loop (control even=+2) will start at index 0
	Evenletter=
String odd letter
	For loop (odd index) will start at index 1
	oddletter=
Return evenletter+” “+oddletter
 */
package com.company;
import java.util.*;
public class AshtonHigginsStringChallenge {
    public static void main(String[] args) {
       int LenString;
       Scanner Keyboard= new Scanner(System.in);
       do{
           System.out.println("How many words would you like to type? Your answer: ");
           LenString= Keyboard.nextInt();
       }while (LenString<1||LenString>10);
       for (int loop=1; loop<=LenString; loop++){
           System.out.println("Enter a word: ");
           String inputword= Keyboard.next();
           if(inputword.length()>=2){
               String receiveword= scramble(inputword);
               System.out.println(receiveword);
           }
       }

    }
    public static String scramble(String inputword){
        StringBuilder evenstring= new StringBuilder();
        StringBuilder oddstring= new StringBuilder();
        int stringlength= inputword.length();
        for (int evenchar= 0; evenchar<=stringlength-1; evenchar=evenchar+2){
            char output= inputword.charAt(evenchar);
            evenstring.append(output);
        }
        for (int oddchar=1; oddchar<= stringlength-1; oddchar= oddchar+2){
            char output=inputword.charAt(oddchar);
            oddstring.append(output);
        }
        return evenstring+" "+oddstring;
    }
}
