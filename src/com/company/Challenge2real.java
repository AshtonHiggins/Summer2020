package com.company;

/*This is my first program
We are going to print something
06/02/2020
This is my other line*/
public class Challenge2real {

    public static void main(String[] args) {
        // write your code here
        String name = "Ashton";
        sayHI(name);
        String teacher= "Maria Suarez";
        sayHI(teacher);
        Challenge2Loops.Line();
    }
    public static void sayHI(String name){
        System.out.println("Hi "+name);
        name=name.toUpperCase();
        int len= name.length();
        System.out.println("Your name is "+len+" characters long");

    }

    public static void Line(){

        System.out.println("#================#");

    }

    public static void Top(){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}
