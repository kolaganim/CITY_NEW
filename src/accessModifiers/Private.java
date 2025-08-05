package accessModifiers;

public class Private {
    private String name = "Meghana";
    private int age = 20;

    public static void main(String[] args) {
        Private obj = new Private();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
