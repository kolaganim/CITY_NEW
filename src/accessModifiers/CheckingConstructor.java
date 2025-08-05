package accessModifiers;

public class CheckingConstructor {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(add(10,20));
        CheckingConstructor obj = new CheckingConstructor();
    }
    public CheckingConstructor(){
        System.out.println("Megha");
    }
    public static int add(int a,int b){
        return a+b;
    }
}
