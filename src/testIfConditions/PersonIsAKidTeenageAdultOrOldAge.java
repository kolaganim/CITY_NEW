package testIfConditions;

import java.util.Scanner;

public class PersonIsAKidTeenageAdultOrOldAge {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();
        if (age<=10) {
            System.out.println("Child");}
        else if((age>10)&&(age<20)){
            System.out.println("Teenage");}
        else if((age>20)&&(age<50)){
            System.out.println("Adult");}
            else if((age>50)&&(age<100)){
                System.out.println("Oldage");
            }
        }

    }