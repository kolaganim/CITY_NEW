package testIfConditions;

public class Sample {
    int a,b;
    char ch;
    int add(){
        return a+b;
       // Sample s = new Sample();
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        s.a=10;
        s.b=20;
        System.out.println(s.add());
        System.out.println(s.ch);
    }
}