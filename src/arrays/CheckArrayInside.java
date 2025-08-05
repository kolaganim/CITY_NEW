package arrays;

import java.util.Arrays;

public class CheckArrayInside {
    public static void main(String[] args) {
        int[] a =new int[5];
        a[0]=12;
        a[1]=32;
        a[2]=152;
        a[3]=129;
        a[4]=123;
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
