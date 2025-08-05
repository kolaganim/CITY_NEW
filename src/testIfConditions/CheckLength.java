package testIfConditions;

public class CheckLength {
     static int salary =2000000;
     int age =20;
    public static void main(String[] agrs) {
        String s1="Hello AP";
        String s2="Hello AP";
        String s3="12";
        CheckLength obj = new CheckLength();
        int num =Integer.parseInt(s3);
        System.out.println(num);
        System.out.println(s1=s2);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat(s2));
        System.out.println(salary);
        System.out.println(obj.age);
    }
}
