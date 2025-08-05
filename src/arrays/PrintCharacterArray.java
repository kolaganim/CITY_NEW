package arrays;

public class PrintCharacterArray {
    public static void main(String[] args) {
        char[] ch = {'M','E','G','H','A'};
        ch[1] = 'K';
        ch[2] = 'B';
        for(char temp :ch){
            System.out.println(temp);
        }
    }
}
