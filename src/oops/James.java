package oops;

public class James {
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a) {
        return "a";
    }
        public static int add(){
        int sum = 0;
        for(int i =0;i<=10;i++){
            sum = sum+i;

        }
        return sum;
    }

    public static void main(String[] args) {
        James obj = new James();
        System.out.println(obj.add(12,12));
        System.out.println(obj.add("Meghana"));
        System.out.println(James.add());
    }
}
