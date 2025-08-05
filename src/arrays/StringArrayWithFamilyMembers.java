package arrays;
import java.util.Arrays;
public class StringArrayWithFamilyMembers {
    public static void main(String... args) {//instead of String[] we use ...
        String[] a = {"Basavaiah","Anuradha","Manasa","Meghana","Aswini"};
        String name = a[1];
        char[] ch = name.toCharArray();
        for(char c :ch) {
            System.out.println(c);
            /*A
              n
              u
              r
              a
              d
              h
              a
             */
        }
        System.out.println(ch[1]+"");
    }
}
