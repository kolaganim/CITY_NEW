package aithmeticOperators;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0;
        int pow =1;// 2 pow 0 =1
        while(bin>0){
            int remainder =bin%10;
            dec = dec+remainder*pow;
                    pow = pow *2;
            bin/=10;
        }
        System.out.println(dec);
    }
}
