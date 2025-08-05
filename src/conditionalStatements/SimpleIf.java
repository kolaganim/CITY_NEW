package conditionalStatements;
import java.util.Scanner;
public class SimpleIf {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int number =num.nextInt();
        if(number%2==0)
        {
            System.out.println("Even");
        }
    }
}