package loopstatements;
import java.util.Scanner;
public class TodayClass{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int b = scr.nextInt();
        int product = 1;
        for(int x = 1; x<=b;x++)
            product *= n;
        System.out.println(product);
    }
}
