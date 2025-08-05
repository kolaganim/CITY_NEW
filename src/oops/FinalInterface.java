package oops;

public class FinalInterface implements R{


    public int age() {
        return 0;
    }


    public String name() {
        return "";
    }


    public String deprt() {
        return "";
    }


    public int add() {
        return 0;
    }

    public static void main(String[] args) {
        FinalInterface obj = new FinalInterface();
        System.out.println(obj.add());
        System.out.println(obj.deprt());
        System.out.println(obj.name());
        System.out.println(obj.age());
    }
}
