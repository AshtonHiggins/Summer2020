package com.company;
import java.util.Scanner;
public class FirstWordLetterCounter {
public static Scanner Keyboard=new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Type any phrase: ");
        String phrase = Keyboard.nextLine();
        String Firstword = firstword(phrase);
        int len = Firstword.length();
        System.out.println(" is " + len + " characters long");
        char letter = 0;
        int count = 0;
        for (int index = 0; index < Firstword.length(); index++) {
            letter = Firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = phrase.substring(index + 1);
                len = temp.indexOf(letter);
                while (len >= 0) {
                    count++;
                    //       System.out.println(temp + " " + indexOf);
                    temp = temp.substring(len + 1);
                    len = temp.indexOf(letter);
                }
                count= restProg(letter, phrase, count);
                phrase = phrase.replace(letter, ' ');
                Firstword= Firstword.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }
    public static int restProg(char letter, String phrase, int count){
        //solve your problem
        return count;
    }
    public static String firstword (String phrase){
        int indexOf= phrase.indexOf(" ");
        String firstword= phrase.substring (0, indexOf);
        System.out.print(firstword);
        return firstword;
    }
}