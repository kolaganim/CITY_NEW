package string;

public class CheckingMath {
    public static void main(String[] args) {
        //StringBuilder s1 = new StringBuilder("Faang");
        StringBuffer s1 = new StringBuffer("Faang");
        s1.append(" Hello");
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.insert(2,'v'));
        System.out.println(s1.delete(1,2));
    }
}
