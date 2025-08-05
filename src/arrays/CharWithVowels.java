package arrays;
import java.util.Arrays;
public class CharWithVowels {
    public static void main(String[] args) {
        char[] ch = new char[5];
        ch[0]='a';
        ch[1]='e';
        ch[2]='i';
        ch[3]='o';
        ch[4]='u';
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
        System.out.println(ch[4]);
        // Instead of above lines we just simplify with one line is below
        System.out.println(Arrays.toString(ch));

    }
}
