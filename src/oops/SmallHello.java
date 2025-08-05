package oops;

public class SmallHello extends Hello {
    int age = 10;
    String name = "Kolagani";
    public static void main(String[] args) {
      // Hello obj = new Hello();
        SmallHello obj =new SmallHello();

        //Hello obj = new SmallHello();
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.add(10,20));
        System.out.println(obj.sub(20,19));
        System.out.println(obj.multiplication(10,2));
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public int add( int a,int b){
        return a*b;
    }

}
