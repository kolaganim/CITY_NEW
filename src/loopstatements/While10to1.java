package loopstatements;

public class While10to1 {
    public static void main(String[] args) {
        int a = 10;
        while (a == 10) {
            for (a = 10; a >= 1; a--)
                System.out.print(a+" ");
        }
    }
}