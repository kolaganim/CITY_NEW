package conditionalStatements;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int number =scr.nextInt();
        //int number1=scr.nextInt();
        if((number%4==0)&&(number%100!=0))
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }

}
