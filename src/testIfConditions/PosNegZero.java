package testIfConditions;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        if (a > 0) {
            System.out.println("Positive");}
            else if(a<0){
            System.out.println("Negative");}
            else if(a==0){
                System.out.println("Zero or Equal");
            }

        }
    }
