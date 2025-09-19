package basics;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = 1;
        for(int x = 1; x<=b;x++)
            product *= a;
        System.out.println(product);
    }
}
