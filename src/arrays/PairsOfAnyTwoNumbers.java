package arrays;
import java.util.Scanner;
public class PairsOfAnyTwoNumbers {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();//Read value of n
            int[] a = new int[n];//size of array
            for(int i = 0;i < n; i++)
                a[i] = sc.nextInt();//User give the values
            int target = sc.nextInt();//Reach teh target value
            for(int i = 0;i <= n-1; i++)
                for(int j = i+1; j<n; j++)
                    if(a[i]+a[j]==target){
                        System.out.println("true");
                        return;//exit the loop if it returns our target value
                    }
            System.out.println("false");
        }
    }
