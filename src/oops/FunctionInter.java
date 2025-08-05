package oops;

public class FunctionInter implements HelloInter {
    public int add(int a,int b){
        return a + b;
    }
    public String name(){
        return "Meghana";
    }

    public static void main(String[] args) {
        HelloInter obj = new FunctionInter();
        System.out.println(obj.add(20,20));
    }
}
