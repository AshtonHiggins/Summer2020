package com.company;

/*This is my first program
We are going to print something
06/02/2020
This is my other line*/
public class Challenge2Loops {

    public static void main(String[] args) {
        // Call all my functions
        Line();
        Top();
        Bottom();
        Line();
    }
    public static void Line(){
        System.out.print("#");
        //initialize    control   increment
        for(int dash=0;dash <16; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void Top(){
        for(int line=1; line <=4; line++) {
            System.out.print("|");
            for (int space = 0; space < -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            //make the loops for the dots
            for (int dot = 0; dot < 4* line -4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            //call the space function
            for (int space = 0; space < -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Bottom(){
        for(int line=1; line< 5; line++) {
            System.out.print("|");
            for (int space = 0; space < -2 * line + 8 ; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 0; dot < 4* line -4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space=0; space< -2 *line +8; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
