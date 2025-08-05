package accessModifiers;

public class ParamsConstructor {
    private int age;
    private String name;
    private String course;
    private long salary;

    public ParamsConstructor(int age,String name,String course,long salary){
        this.age= age;
        this.name= name;
        this.course= course;
        this.salary= salary;
        System.out.println(age);

    }
    public ParamsConstructor(){
        System.out.println("I'm P");
    }

    public static void main(String[] args) {
        ParamsConstructor parm = new ParamsConstructor();
        ParamsConstructor obj =new ParamsConstructor(19,"Megha","CSE",100000);
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.course);
        System.out.println(obj.salary);



    }

}
