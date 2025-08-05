package testIfConditions;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();
        if((year%400==0)&&(year%100!=0))
        {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }

    }
}
