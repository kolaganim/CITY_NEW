package basics;
import java.util.Scanner;
public class ReadingNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String s1= num.nextLine();
        int i1= num.nextInt();
        // num.nextLine();
       // String s1= num.nextLine();
        System.out.println(i1);
        System.out.println(s1);
    }
}