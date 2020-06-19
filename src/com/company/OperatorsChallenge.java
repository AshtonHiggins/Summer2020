/* Ashton Higgins Operators Challenge
I will import the scanner using java.util
then I will print a statement asking for the base price of the meal as a double
then I will scan the answer the user provides,
and create a variable 'meal' that I will then use to calculate tax and tip
then i will ask for an integer that represents the tip percent that they would like to add
and then I will create a variable (probably as a double in decimal form) to be the tax percent
then I will ask the user what percent (as an integer) tax is for them
and I will convert it into a decimal double variable just like I did for tax unless i find a way to evaluate with integers
I will make an equation with the tax and meal variables to find the total tax
and an equation with the tip and meal variables to find the total tip
and then I will add total tax and tip to the meal cost to find the total meal cost
I will round the total meal cost to the next closest integer
and print this number as the total cost
*/
package com.company;
import java.util.Scanner;
class AshtonHigginsOperatorsChallenge {
    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double mealCost;
        int tip;
        int tax;
    }
        static void solve(double mealCost,int tip,int tax) {
            System.out.print("What is the cost of your meal? Your meal subtotal: ");
            mealCost = Double.parseDouble(Keyboard.nextLine());
            System.out.print("Tax percentage as an integer: ");
            int taxpercent = Keyboard.nextInt();
            System.out.print("Tip percentage as an integer: ");
            int tippercent = Keyboard.nextInt();
            double tipp = mealCost * (tippercent / 100);
            double taxx = mealCost * (taxpercent / 100);
            double meal_cost = Math.round(Float.parseFloat(String.valueOf(taxx + tipp + mealCost)));
            System.out.println("Total Cost: " + meal_cost);
        }
    }

