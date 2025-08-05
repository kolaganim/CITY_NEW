package basics;

import java.util.Scanner;

public class ReadingStringWithNext {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s1 = scr.next();
        String s2 = scr.next();
        //String s1 = scr.nextLine();
        //String s2 = scr.nextLine();

        System.out.println(s1+" "+s2);
    }
}
