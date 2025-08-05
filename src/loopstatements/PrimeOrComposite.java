package loopstatements;

import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("composite");
                check = 1;
                break;
            }
            if (check == 0) {
                System.out.println("Prime");
            }
        }
    }
}
