package loopstatements;

import java.util.Scanner;

public class CheckFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                fact++;
            }
            if (fact == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }

        }
    }
}
