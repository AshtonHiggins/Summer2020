/*Import scanner
Ask the user for how many days they want to measure (between 2 and 100)
	Add 1 to number when we make it a variable (might need to subtract one and then add 2)
Set up a random number variable (between 25 and 110) to 86+25
Create a loop that repeats however many times the user input variable is
Then we add all outputs together and divide by user input variable to get the average
Print each day’s high temp as a line
	For every day
Print the average temp of (user input variable) days
NEW IDEA FOR PSEUDOCODE:
Set up an array statement (Temperature at Day X: Rand)
Then create a variable for X that starts at 1 and increases +1 every time a line is printed
Replace the char at Rand with a new random number every time the line is printed
Create this all in a for loop so that it prints however many times the user asks for in the do loop
*/
package com.company;
import java.util.*;
public class IntroArrays {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Random rand = new Random();
        int days;
        do {
            System.out.print("How many days temperature (between 2 and 100)? Your answer: ");
            days = Keyboard.nextInt();
        } while (days <= 2 || days >= 100);
        int [] temp=new int[days];
        int total=0;
        for (int x=0; x<days; x++){
            temp[x] = rand.nextInt(85) + 25;
            System.out.println("On day "+x+1+" the high temperature was: "+ rand);
            total=total+temp[x];
        }
        double average= (double) total/days;
        System.out.println("The average temperature for "+ days +" days was: "+average );
    }
}

