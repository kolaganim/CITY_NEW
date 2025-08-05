package testIfConditions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        if (a%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    }
