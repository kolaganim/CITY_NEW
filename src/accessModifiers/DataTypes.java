package accessModifiers;

public class DataTypes {
    public float add(int a ,int b){
        return a+b;
    }
    public float sub(int a ,int b){
        return a-b;
    }
    public float mul(int a ,int b){
        return a*b;
    }
    static public float div(int a ,int b){
        return a/b;
    }
    static public float mod(int a ,int b){
        return a%b;
    }

    public static void main(String[] args) {
        DataTypes d = new DataTypes();
        System.out.println(d.add(10,20));
        System.out.println(d.sub(10,20));
        System.out.println(d.mul(10,20));
        System.out.println(div(10,20));
        System.out.println(mod(10,20));
    }
}
