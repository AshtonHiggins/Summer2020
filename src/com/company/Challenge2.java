package com.company;

/*This is my first program
We are going to print something
06/02/2020
This is my other line*/
class Challenge3 {
public static final int SIZE=6;
    public static void main(String[] args) {
        // write your code here
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }
    public static void Line(){

        System.out.print("+");
        //initialize control increment
        for(int dash=0; dash<2*SIZE+1; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Top(){
        for(int line=1; line<= SIZE; line++){
            System.out.print("|");
            spacesTop(line);
            for(int frontslash=1;frontslash<=line-1; frontslash++){
                System.out.print("/");
            }
            System.out.print("*");
            for(int backslash=1;backslash<=line-1; backslash++){
                System.out.print("\\");
            }
            spacesTop(line);
            System.out.println("|");

        }
    }
    public static void Bottom(){
        for(int line=1; line<= SIZE; line++){
            System.out.print("|");
            spacesBottom(line);
            for(int backslash=1; backslash<=-line+SIZE; backslash++){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int frontslash=1;frontslash<=-line+SIZE; frontslash++){
                System.out.print("/");
            }
            spacesBottom(line);
            System.out.println("|");
        }
    }
    public static void spacesTop(int line) {
        for(int space = 1;space<= SIZE-line+1; space++) {
            System.out.print(" ");
        }
    }
    public static void spacesBottom(int line){
        for(int space = 1; space <= line; space++) {
            System.out.print(" ");
        }
    }
}
