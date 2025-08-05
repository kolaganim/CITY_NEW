package testIfConditions;

import java.util.Scanner;

public class LowercaseUppercase {
    public static void main (String[] args){
        Scanner scr = new Scanner(System.in);
        char c = scr.next().charAt(0);
        if((c>=97)&&(c<=122))
            System.out.println("Lower case letter");
            else if((c>=65)&&(c<=90))
                System.out.println("Upper case letter");
                else
            System.out.println("Invalid");
            }
        }


