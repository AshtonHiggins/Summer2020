package com.company;
import java.util.Scanner;
public class GangstaName {
public static Scanner Keyboard=new Scanner (System.in);
    public static void main(String[] args) {
        // First I am going to make a char variable for the first letter (index=0)
        //Then I am going print the letter with the word "Diddy"
        //Then I am going to make a string for the last name and make it all caps
        //Then I will reuse the string name I used for the first initial for my first name,
        //to print my first name + the term "-izzle"
        System.out.print("Type your name playa: ");
        String fullname= Keyboard.nextLine();
        int indexOfSpace= fullname.indexOf(" ");
        System.out.print("Your gangsta name is ");
        char letter= fullname.charAt(0);
        System.out.print(letter + ". Diddy");
        lastname(fullname,indexOfSpace);
        firstname(fullname, indexOfSpace);
        System.out.println("-izzle");
    }
    public static void lastname (String fullname, int indexOfSpace){
        if (indexOfSpace>0){
            String lastname= fullname.substring(indexOfSpace);
            lastname=lastname.toUpperCase();
            System.out.print(lastname);
        }
    }
    public static void firstname (String fullname, int indexOfSpace){
        String firstname= fullname.substring(0, indexOfSpace);
        System.out.print(" "+firstname);
    }
}