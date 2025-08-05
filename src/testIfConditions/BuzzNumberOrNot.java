package testIfConditions;

import java.util.Scanner;

public class BuzzNumberOrNot {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num%7==0)
        {
            System.out.println("Buzz Number");
        }
        else {
            System.out.println("Not Buzz Number");
        }

    }
}
