package org.example.programs;

import java.util.Scanner;

public class Search {
    private static Scanner s = new Scanner(System.in);
    
    public static String searchArray(String searchkey){
        String names[] = new String[5];

        System.out.println("\n--------Search a value in an array--------");

        for(int i = 0; i < names.length; i++){
            System.out.print("Enter a value: ");
            String name = s.next();
            names[i] = name;
        }

        for(String name: names){
            if(name.equals(searchkey)) {
                return "\nFounded: " + name;
            }
        }
        return "\nNo value matched";        
    }
}
