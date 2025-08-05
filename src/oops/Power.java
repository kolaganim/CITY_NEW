package oops;

public class Power implements PowerStarInterface {

    public String department(){
        return "CSE";
    }

    public String name(){
        return "Meghana";
    }

    public int rollno(){
        return 568;
    }

    public int age(){
        return 19;
    }

    public static void main(String[] args) {
        Power obj = new Power();
        System.out.println(obj.department());
        System.out.println(obj.name());
        System.out.println(obj.rollno());
        System.out.println(obj.age());

    }
}
