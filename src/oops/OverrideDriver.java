package oops;

public class OverrideDriver extends Override {

    public static int add(int a){

        return a;
    }
    public int mul(int a,int b){

        return a+b;
    }

    public static void main(String[] args) {
        Override obj = new Override();
        System.out.println(obj.mul(12,30));
        System.out.println(Override.add(10));
    }
}