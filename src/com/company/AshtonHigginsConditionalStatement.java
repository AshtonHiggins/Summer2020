/* First I will import the scanner
Main
I will set up the random variable
And make a do loop
	Put the random variable into an integer and limit it to be between 1 and 137
	Print “Your number is: “ along with their number
	Input the statement of weird or not weird from the solve method
	Then I will ask them if they want to go again
	It will repeat the loop if they type anything with the letter ‘y’
Then I will set up the solve method
I will make an if statement if the number is odd
	Print weird
Then three else if statements if the number is even
	Each will have different ranges in value
	Two will print not weird, and one will print weird
*/
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
