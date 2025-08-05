package oops;

import java.util.Scanner;

public class Calculate {
    public static int area(int side){
        return side*side;
    }
    public static int area(int length,int breadth){
        return length*breadth;
    }
    public static double area(double radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double radius = sc.nextDouble();
        System.out.println("Area of Square:" +area(side));
        System.out.println("Area of Rectangle:" +area(length,breadth));
        System.out.println("Area of circle:"+area(radius));

    }

}
