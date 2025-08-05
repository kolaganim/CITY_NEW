package accessModifiers;

public class MethodAdd {
    //Method called add with one input
    static public int add(){
        int a = 10;
        int b = 20;
        return a+b;
    }
    //Method called add with 2 inputs
        public int add(int a,int b){
            return a+b;
        }
        //Method called add with 3 inputs
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public String display(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        MethodAdd obj = new MethodAdd();
        System.out.println(add());//Or we can call the add method with Class_name.add()
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.display());
    }

    }
