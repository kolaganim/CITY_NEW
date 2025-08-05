package oops;

public class MInfoDriver {
    public static void main(String[] args) {
        MInfo obj = new MInfo();
        obj.setAge(19);
        obj.setName("Meghana");
        obj.setBranch("CSE");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getBranch());
    }
}
