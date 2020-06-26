/*
Ashton Higgins
import arrays and random
create a random variable
initialize a size variable based on the random variable that is between 5-10
make the size of the array the variable
make index 1 and 2
In a do while loop, initialize index 1 and index 2 to be random integers within the bounds of the size
in the while part of the do while loop, make sure index 1 and 2 are not equal
print index 1 and 2
create a for loop that adds random integers between 1-99 to each index in the array
print the array before swap
create a temporary int variable and make it equal to the array at index1
make the array at index1 equal to the array at index2
make array at index 2 equal to temporary variable
print final array with the swaps
 */
package com.company;
import java.io.*;
import java.util.*;
    public class AshtonArrays {
        public static void main(String[] args) throws FileNotFoundException{
            File file= new File("C:\\Users\\ashto\\IdeaProjects\\Summer2020\\src\\com\\company\\Weather.txt");
            Scanner scan= new Scanner(file);
            double temp1=0;
            double temp2=0;
            if (scan.hasNextDouble()){
                temp1=scan.nextDouble();
            }
            while(scan.hasNextLine()){
                if (scan.hasNextDouble()){
                    temp2=scan.nextDouble();
                    System.out.printf("the difference between %.2f and %.2f is %7.2f\n ",temp1,temp2, (temp2-temp1));
                    temp1=temp2;
                }
                else{
                    String trash= scan.next();
                }
            }
        }
    }
