package testIfConditions;
import java.util.Scanner;
public class EqualOrNot {
    public static void main(String[] agrs){
        Scanner scr=new Scanner(System.in);
        int a= scr.nextInt();
        int b= scr.nextInt();
        if(a==b){
            System.out.println("Equal");}
            else{
            System.out.println("Not Equal");
            }

    }
}
