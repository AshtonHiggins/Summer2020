package com.company;

public class Receipt {

    public static void main(String[] args) {
        int meal1= 38;
        int meal2= 40;
        int meal3= 30;
        int subtotal= meal1+meal2+meal3;
        final double Tax= 0.08;
        final double Tip= 0.15;
        final double paidtax= subtotal * Tax;
        final double paidtip= subtotal * Tip;

        System.out.println("Subtotal:" + subtotal);

        System.out.println("Tax:" + paidtax);

        System.out.println("Tip:" + paidtip);

        System.out.println("Total:" + (subtotal + paidtax + paidtip));

        }

    }