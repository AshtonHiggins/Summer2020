package com.company;
import java.util.Scanner;
class DataTypeChallenge {
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args) {
    int num1= 4;
    double doubley1= 4.0;
    String statement1= "is my favorite place to have lunch";
       System.out.print("Where is your favorite place to have lunch? Your answer: ");
               String lunch= Keyboard.nextLine();
               System.out.print("Type a whole number: ");
               int integer= Keyboard.nextInt();
               System.out.print("Type any number with a decimal: ");
               double number= Keyboard.nextDouble();
               int variablename= integer+num1;
               double variable= doubley1+number;
               String stringname= lunch+" "+statement1;
               System.out.println(variablename);
               System.out.println(variable);
               System.out.println(stringname);
               }
               }
