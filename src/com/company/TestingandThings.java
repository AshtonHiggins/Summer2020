package com.company;
public class TestingandThings {
    public static void main(String[] args) {
        double doubly1=9.98;
        double doubly2= doubly1*3.234234;
        double doubly3= doubly2/2.345345;
        int num1= 345;
        int num2= -58;
        String whatever= "Greenhill";
        System.out.printf("Showing how to use printf \n %10.3f \n %10.3f \n %10.3f \n -%6d \n -%6d \n %20.10s",
                doubly1, doubly2, doubly3, num1, num2, whatever);
    }
}
