package package2;

import package1.HelloJava;

public class JavaDriver {
    public static void main(String[] args){
        HelloJava hj =new HelloJava();
        System.out.println(HelloJava.name);
        System.out.println(hj.age);
        System.out.println(HelloJava.courseFee);
    }
}
