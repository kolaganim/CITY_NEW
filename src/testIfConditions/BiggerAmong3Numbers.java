package testIfConditions;

import java.util.Scanner;

public class BiggerAmong3Numbers {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        if ((a > b)&&(a> c)) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }
    }
}