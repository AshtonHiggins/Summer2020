package com.company;
import java.util.*;
public class AshtonHigginsConditionalStatement {
    public static Scanner Keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        Random rand = new Random();
        String response="";
        do {
            int number = rand.nextInt(137) + 1; //between 1 and 137
            System.out.println("Your number is: "+number);
            solve(number);
            System.out.println("Do you want to go again? Type yes or no: ");
            response = Keyboard.next();
        }
        while (response.contains("y"));
    }
    private static void solve(int number){
        if (number%2==1){
            System.out.println("Weird");
        }
        else if (number%2==0&&number>=2||number<=5){
            System.out.println("Not weird");
        }
        else if (number%2==0&&number>=6||number<=20){
            System.out.println("Weird");
        }
        else if (number%2==0&&number>20){
            System.out.println("Not weird");
        }
    }
}
