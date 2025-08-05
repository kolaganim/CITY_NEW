package accessModifiers;

import java.util.Arrays;

public class BasicAnagram {
    public static char[] charactersArray(String a){
        return a.toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(charactersArray("Meghana")));
    }
}
