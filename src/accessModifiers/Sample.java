package accessModifiers;

public class Sample {
    public String EvenOrOdd(int a){
        if(a%2==0){
       return "Even";}
        else
            return "Odd";


    }

    public static void main(String[] args) {
        Sample s = new Sample();
            System.out.println(s.EvenOrOdd(10));
        }
    }


