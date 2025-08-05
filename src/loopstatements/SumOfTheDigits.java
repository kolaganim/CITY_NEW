package loopstatements;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = scr.nextInt();
        int sum = 0;
        while(a>0) {
            int digit = a % 10;  // Get last digit
            sum += digit;             // Add to sum
            a/= 10;
        }
            System.out.println("Sum of given number: "+sum);
        }

    }

