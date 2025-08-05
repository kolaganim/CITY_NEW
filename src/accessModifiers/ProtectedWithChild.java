package accessModifiers;

public class ProtectedWithChild extends Protected {
    public static void main(String[] args) {
        ProtectedWithChild obj = new ProtectedWithChild();
        System.out.println(obj.name);
        System.out.println(obj.age);

        System.out.println(obj.add(20,30));

    }

}
