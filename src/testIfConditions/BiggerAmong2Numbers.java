package testIfConditions;

import java.util.Scanner;

public class BiggerAmong2Numbers {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        if((a>b)||(b>a)){
            System.out.println("A is Bigger");}
        else{
            System.out.println("A is Smaller");
        }
    }
}