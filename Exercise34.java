/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 34
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.util.*;

public class Main
{
  public static void main(String[] args) 
  {
        
    Scanner scanner = new Scanner(System.in);
       
    String[] namesArr = new String[5];
    namesArr[0] = "John Smith";
    namesArr[1] = "Jackie Jackson";
    namesArr[2] = "Chris Jones";
    namesArr[3] = "Amanda Cullen";
    namesArr[4] = "Jeremy Goodwin";
       
    System.out.print("There are 5 employees:" + "\n");
    System.out.print(namesArr[0] + "\n");
    System.out.print(namesArr[1] + "\n");
    System.out.print(namesArr[2] + "\n");
    System.out.print(namesArr[3] + "\n");
    System.out.print(namesArr[4] + "\n");
       
    System.out.println("Enter an employee name to remove: ");
    String nameToRemove = scanner.nextLine();
       
       
    String[] copy = new String[4];

    for (int i = 0, j = 0; i < 5; i++) 
    {
           
      if(!namesArr[i].equals(nameToRemove))
      {

        copy[j++] = namesArr[i];

      }
           
    }
       
    System.out.println("There are 4 employees:");
    System.out.println(copy[0]);
    System.out.println(copy[1]);
    System.out.println(copy[2]);
    System.out.println(copy[3]);
    
  }
}
