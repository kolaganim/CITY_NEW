package accessModifiers;

public class ProtectedDriver {
    public static void main(String[] args) {
        Protected obj = new Protected();
        System.out.println(obj.name);
        System.out.println(obj.age);

        System.out.println(obj.add(20,30));

    }
}
