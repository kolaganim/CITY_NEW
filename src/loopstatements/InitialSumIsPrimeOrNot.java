package loopstatements;

import java.util.Scanner;

public class InitialSumIsPrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        for(int i=2;i<=12;i++){ // It is the worst case
            //If I wrote n/2 instead of n it is the Average case
            //If I wrote i*i <= n without using Math.sqrt(); instead of n It is teh best case
            if(n%i==0){
                fact++;

            }
        }
        if(fact==1)
        {
            System.out.println("Prime");
        }
        else
            System.out.println("Not a Prime");
    }
}
