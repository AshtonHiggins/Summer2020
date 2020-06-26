package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherProcessing {
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
