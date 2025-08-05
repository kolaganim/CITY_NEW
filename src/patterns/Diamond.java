package patterns;
import java.util.*;
public class Diamond {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            // Upper half of the diamond
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print stars with space
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Lower half of the diamond
            for (int i = n - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print stars with space
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
