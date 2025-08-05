package conditionalStatements;
import java.util.Scanner;
public class IfElseStmt {
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int number =scr.nextInt();
        int number1=scr.nextInt();
        if(number>number1)
        {
            System.out.println("Number Is Bigger Than Number1");}
            else{
                System.out.println("Number Is Not Bigger Than Number1");
            }

        }
    }
