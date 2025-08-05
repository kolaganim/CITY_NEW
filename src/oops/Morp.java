package oops;

public class Morp {
    public int add(int a){
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }
    public String add(String c,String d,String e){
        return c+d+e;
    }

    public static void main(String[] args) {
        Morp obj = new Morp();
        System.out.println(obj.add(10));
        System.out.println(obj.add(10,20));
        System.out.println(obj.add("Megha","Assi","Maza"));
    }
}
