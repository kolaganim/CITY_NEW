package conditionalStatements;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        //int number1=scr.nextInt();
        if (number > 0) {
            if (number >= 0) {
                System.out.println("Positive");}
                else
                {
                    System.out.println("Negative");
                }
            }
        }
    }