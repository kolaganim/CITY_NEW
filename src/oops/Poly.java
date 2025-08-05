package oops;

public class Poly {
    public void display(int a) {
        System.out.println("One Parameter");
    }
    public void display(int a,int b){
        System.out.println("Two Parameters");
    }
    public void display(String name){
        System.out.println("It is a String");
    }
    public static void main(String[] args) {
        Poly obj = new Poly();
       obj.display(10);
       obj.display(10,20);
       obj.display("CITY");


    }
}
