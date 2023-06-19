package org.example;

import java.util.Arrays;
import java.util.Scanner;

import org.example.programs.Reverse;
import org.example.programs.Search;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning) {
            menu();
    
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
    
            switch (choice) {
                case 1:
                    String[] values = Reverse.reverseArray();

                    System.out.print("\nReversed: ");
                    System.out.println(Arrays.toString(values));
                    break;
                case 2:
                    String reversedValue = Reverse.reverseString();
                    System.out.println("Reversed: " + reversedValue);
                    System.out.println();
                    break;
                case 3:
                    System.out.println(Search.searchArray());      
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }

        s.close();
    }

    private static void menu(){
        System.out.println("\n--------Code machine--------");
        System.out.println("1.Reverse an array");
        System.out.println("2.Reverse a string");
        System.out.println("3.Search a value in an array");
        System.out.println("4.Exit\n");
    }
}