package loopstatements;

public class WhileEvenOdd {
    public static void main(String[] args){
        int a = 20;
        while(a<=20){
            System.out.print("Even: ");
            for(a=0;a<=20;a++){
                if(a%2==0)
                System.out.print(a+" ");
            }
            System.out.println();
            System.out.print("Odd: ");
            for(a=0;a<=20;a++)
                if(a%2!=0)
                    System.out.print(a+" ");
        }
    }

}
