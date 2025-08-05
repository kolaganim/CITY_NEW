package conditionalStatements;
import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int number =scr.nextInt();
        //int number1=scr.nextInt();
        if(number>0) {
            System.out.println("Positive");
        }
        else if(number<0)
        {
            System.out.println("Negative");
        }
            else{
            System.out.println("Equals");
        }
        }
}
