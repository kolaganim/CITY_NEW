package basics;
import java.util.Scanner;
public class DataReading {
    public static void main(String[] args){
        Scanner scr = new Scanner (System.in);
        int i =scr.nextInt();
        int j =scr.nextInt();
        System.out.println(i+j);
        float f1 =scr.nextFloat();
        float f2 =scr.nextFloat();
        System.out.println(f1+f2);
        double d1=scr.nextDouble();
        double d2=scr.nextDouble();
        System.out.println(d1+d2);
       /* char c1=scr.next();
        char c2=scr.next();
        System.out.println(c1+c2);*/
        boolean b1 =scr.nextBoolean();
        boolean b2 =scr.nextBoolean();
        System.out.println(b1=b2);
        byte q1 =scr.nextByte();
        byte q2 =scr.nextByte();
        System.out.println(q1+q2);
        short s1 =scr.nextShort();
        short s2 =scr.nextShort();
        System.out.println(s1+s2);
        long l1 =scr.nextLong();
        long l2 =scr.nextLong();
        System.out.println(l1+l2);
    }
}
