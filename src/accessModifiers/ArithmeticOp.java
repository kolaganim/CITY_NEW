package accessModifiers;

public class ArithmeticOp {
    static public int add(int a,int b){
        return a+b;
    }
    static public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int mod(int a,int b){
        return a%b;
    }


    public static void main(String[] args) {
        ArithmeticOp obj = new ArithmeticOp();
        System.out.println(add(10,20));
        System.out.println(sub(10,20));
        System.out.println(obj.mul(10,20));
        System.out.println(obj.div(10,20));
        System.out.println(obj.mod(10,20));

    }
}
