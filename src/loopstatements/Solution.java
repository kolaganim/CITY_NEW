package loopstatements;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false; // found a factor
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a Prime");
        }
    }
}