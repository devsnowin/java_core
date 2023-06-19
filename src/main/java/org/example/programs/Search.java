package org.example.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    private static Scanner s = new Scanner(System.in);
    
    public static String searchArray(){
        System.out.println("\n--------Search a value in an array--------");

        String values[] = {"Apple", "Bannana", "Orange", "Grapes"};
        System.out.println(Arrays.toString(values));

        System.out.print("Enter a value: ");
        String searchkey = s.next();

        for(int j = 0;j < values.length; j++){
            if(values[j].toLowerCase().equals(searchkey.toLowerCase())) {
                return "\nFounded at the index " + j;
            }
        }
        return "\nNo value matched";
    }
}
