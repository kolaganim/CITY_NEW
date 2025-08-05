package oops;

public class EncapsulDriver {

    public static void main(String[] args) {
        Encapsul obj = new Encapsul();
        obj.setName("PSPK");
        obj.setAge(52);
        obj.setRollno(21);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRollno());
    }

}
