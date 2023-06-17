package org.example.programs;

import java.util.Scanner;

public class Reverse {
    private static Scanner s = new Scanner(System.in);
    
    public static void reverseArray() {
        String values[] = new String[5];

        System.out.println("\n--------Reverse an array--------");

        for (int i = 0; i < values.length; i++){
            System.out.print("Enter a value: ");
            String value = s.next();
            values[i] = value;
        }

        System.out.print("Reversed: ");
        for(int  i = values.length-1; i >= 0; i--) {            
            System.out.print(values[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void reverseString(){
        System.out.println("\n--------Reverse a string--------");

        System.out.print("Enter a value: ");
        String value = s.next();
        String reverseValue = "";

        for(int i = value.length()-1; i >= 0; i--){
            reverseValue += value.charAt(i);
        }

        System.out.println("Reversed: " + reverseValue);
        System.out.println();
    }
}
