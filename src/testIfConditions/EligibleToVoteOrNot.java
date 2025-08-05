package testIfConditions;
import java.util.Scanner;
public class EligibleToVoteOrNot {
    public static void main(String[] agrs) {
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();
        if (age>=18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }

    }
