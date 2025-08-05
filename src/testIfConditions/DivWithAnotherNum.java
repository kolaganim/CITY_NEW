package testIfConditions;
import java.util.Scanner;
public class DivWithAnotherNum {
    public static void main(String[] agrs){
        Scanner scr=new Scanner(System.in);
        int a= scr.nextInt();
        int b= scr.nextInt();
        if(a%b==0){
            System.out.println("Divisible");}
        else{
            System.out.println("Not Divisible");
        }

    }
}
