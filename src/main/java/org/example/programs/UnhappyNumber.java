package org.example.programs;

import java.util.Scanner;

public class UnhappyNumber {
    static Scanner s = new Scanner(System.in);

    public static void unhappyNumber(){
        System.out.println("\n--------Unhappy Number--------");
        System.out.println();
        
        System.out.print("Enter a value: ");
        int num1 = s.nextInt();
        
        System.out.print("Enter a value: ");
        int num2 = s.nextInt();

        System.out.print("Unhappy numbers: ");
        for(int i = num1; i <= num2; i++){
            int singleNum = i, sum;

            while(singleNum != 1){
                sum = 0;
                while(singleNum != 0){
                    sum += ((singleNum%10)*(singleNum%10));
                    singleNum/=10;
                }
                if (sum == 4) {
                    System.out.print(i + " ");
                    break;
                } else singleNum = sum;
            }
        }

        System.out.println();
    }
}
