package basics;
import java.util.Scanner;
public class ThreeValues {
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int a= scr.nextInt();
        int b= scr.nextInt();
        int c= scr.nextInt();
        System.out.println((a>b)&&(a>c)?a:(b>c)?b:c);
    }
}
