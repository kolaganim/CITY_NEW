package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramPrblms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        char[] ch = str.toLowerCase().toCharArray();
        char[] ch1 = str1.toLowerCase().toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1)) {
            System.out.println("Anagram");
        }
           else
            System.out.println("Not an Anagram");


        }

    }
