package com.company;

/*This is my first program
We are going to print something
06/02/2020
This is my other line*/
public class Rocket1 {

    public static void main(String[] args) {
        // write your code here
        Top();
        Box();
        System.out.println("|United|");
        System.out.println("|States|");
        Box();
        Top();
    }
    public static void Top(){
        System.out.println("   /\\  ");
        System.out.println("  /  \\ ");
        System.out.println(" /    \\");
    }
    public static void Box(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
