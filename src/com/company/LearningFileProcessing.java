package com.company;
import java.io.*;
import java.util.*;
public class LearningFileProcessing {
    public static void main(String[] args) throws FileNotFoundException{
        File file= new File("C:\\Users\\ashto\\IdeaProjects\\Summer2020\\src\\com\\company\\Weather.txt");
        Scanner scan= new Scanner(file);
        String name= scan.nextLine();
        System.out.println(name);
        Scanner line= new Scanner(name);
        while(line.hasNext()){
            if (line.hasNextInt()){
                System.out.println("The number is: "+line.nextInt());
            }
            else{
                String trash= line.next();
            }
        }
    }
}
