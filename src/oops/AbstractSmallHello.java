package oops;

public class AbstractSmallHello extends AbstractHello {
    //@Override
    public int mul() {
        return 200;
    }
    //@Override
    public String display(){
        return "This is My World";
    }
    //@Override
    public int add(){
        return 20;
    }
    //@Override
    public int sub(){
        return 10;
    }



    public static void main(String[] args) {
        //AbstractHello obj = new AbstractSmallHello();
        AbstractSmallHello obj = new AbstractSmallHello();
        System.out.println(obj.mul());
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.display());
    }


}
