package basics;

import java.util.Scanner;

public class NextPerfectSquare {
    public static boolean isperfect(int n){
        for(int i=0;i<=n;i++){
            if(i*i==n){
                return true;
            }

        }
        return false;



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++) {
            sum = n - i;

            if (isperfect(sum))
                System.out.println(sum);

        }
    }
}
