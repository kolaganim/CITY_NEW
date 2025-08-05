package testIfConditions;

import java.util.Scanner;

public class EvenOrOddWithoutIfElse {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        System.out.println(a%2==0);
    }
}
