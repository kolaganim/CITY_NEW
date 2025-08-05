package accessModifiers;

public class Strings {
    public String concat(){

        return "Meghana" +" "+ "Kolagani";
    }

    public static void main(String[] args) {
        Strings obj = new Strings();
        System.out.println(obj.concat());
    }
}
