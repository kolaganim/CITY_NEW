package collectionInterface;

public class CheckParams {
    private int age ;
    private String name;
    private String bGroup;
    private float sal;
    public CheckParams(int age,String name,String bGroup,float sal){
        this.age =age;
        this.name = name;
        this.bGroup =bGroup;
        this.sal = sal;

    }

    public static void main(String[] args) {
        CheckParams obj = new CheckParams(19,"Megha","O+",100000);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.bGroup);
        System.out.println(obj.sal);
    }
}
