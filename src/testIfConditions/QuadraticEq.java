package testIfConditions;

import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b*b-4*a*c;
        System.out.println(d);
    }
}