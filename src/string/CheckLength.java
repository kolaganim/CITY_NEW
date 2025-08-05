package string;
import java.lang.String;
public class CheckLength {
    public static void main(String[] args) {
        String s1 ="Faang";
        int size = s1.length();
        String s3 = s1.toUpperCase();
        String s4 = s1.concat("Hello");
        String s2 = s1.toLowerCase();


        System.out.println(s1);
        System.out.println(size);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
