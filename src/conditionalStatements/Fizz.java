package conditionalStatements;
import java.util.Scanner;
public class Fizz
{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int number =scr.nextInt();
        //int number1=scr.nextInt();
        if(number%3==0&&number%5!=0)
        {
            System.out.println("Number Divisible by given number");
        }
        else{
            System.out.println("Number not Divisible by given number");
        }
    }
}
