package primes;
import java.util.Scanner;
public class NextPrimes {
    public static boolean nextPrimes(int n){
        if(n<=1)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i =5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =n+1;;i++){
            if(nextPrimes(i)){
                System.out.println(i);
                return;
            }
        }
        /*int next = n+1;
        while(!nextPrimes(next)){
            next++;
        }
        System.out.print(next);*/
    }
}
