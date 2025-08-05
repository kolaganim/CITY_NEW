package basics;
import java.util.Scanner;
public class ReadingString {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s1 = scr.next();
        scr.nextLine();
        String s2 = scr.nextLine();
        System.out.println(s1+ " "+s2);
        //System.out.println(s2);
    }
}