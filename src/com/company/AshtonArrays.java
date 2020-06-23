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
import java.util.Arrays;
import java.util.*;
public class AshtonArrays {
    public static void main(String[] args) {
        Random rand1 = new Random();
        int size = rand1.nextInt(5) + 5;
        int[] array1 = new int[size];
        int index1;
        int index2;

        do {
            index1 = rand1.nextInt(size);
            index2 = rand1.nextInt(size);
        }
            while (index1 == index2) ;

            System.out.println(index1);
            System.out.println(index2);

            for (int i = 0; i < array1.length; i++) {
                array1[i] = rand1.nextInt(98) + 1;
            }

            System.out.println(Arrays.toString(array1));
            array1=swap(array1, index1, index2);
            System.out.println(Arrays.toString(array1));
    }
    public static int[] swap (int[] array1, int index1, int index2){
        int temp = array1[index1];
        array1[index1] = array1[index2];
        array1[index2] = temp;

        return array1;
    }
}