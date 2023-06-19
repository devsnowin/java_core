package org.example.programs;

import java.util.Scanner;

public class Reverse {
    private static Scanner s = new Scanner(System.in);
    
    public static String[] reverseArray() {
        System.out.println("\n--------Reverse an array--------");

        System.out.print("Enter the size: ");
        int size = s.nextInt();
        
        int index = 0;
        String values[] = new String[size];
        String reversedValues[] = new String[size];

        for (int i = 0; i < values.length; i++){
            System.out.print("\nEnter a value: ");
            String value = s.next();
            values[i] = value;
        }

        for(int  i = (values.length)-1; i >= 0; i--) {            
            reversedValues[index] = values[i];
            index++;
        }

        return reversedValues;        
    }
    
    public static String reverseString(){
        System.out.println("\n--------Reverse a string--------");

        System.out.print("Enter a value: ");
        String value = s.next();
        String reverseValue = "";

        for(int i = value.length()-1; i >= 0; i--){
            reverseValue += value.charAt(i);
        }

        return reverseValue;
    }
}
