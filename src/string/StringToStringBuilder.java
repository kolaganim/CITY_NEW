package string;

public class StringToStringBuilder {
    public static void main(String[] args) {
       String s = "Meghana";
       StringBuilder stringbuilder = new StringBuilder(s);
       stringbuilder.append(" Hello");
       stringbuilder.reverse();
       stringbuilder.toString();
       System.out.println(stringbuilder);
    }
}
