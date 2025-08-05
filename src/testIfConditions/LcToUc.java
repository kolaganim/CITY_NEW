package testIfConditions;

import java.util.Scanner;

public class LcToUc {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        //char ch =(char)(c-32);
        char ch =(char)(c+32);
        System.out.println(ch);
       }
    }

