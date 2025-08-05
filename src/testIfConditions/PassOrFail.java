package testIfConditions;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int marks = scr.nextInt();
        if (marks >= 45) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        }
    }