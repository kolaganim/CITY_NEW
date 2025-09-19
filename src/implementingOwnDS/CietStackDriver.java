package implementingOwnDS;
    public class CietStackDriver extends CietStack{
        public static void main(String[] args) {
            int n = 6;
            CietStack ob = new CietStack(n);
            System.out.println(ob.push(5));
            System.out.println(ob.push(6));
            System.out.println(ob.push(6));
            System.out.println(ob.push(7));
            System.out.println(ob.push(8));
            System.out.println(ob.push(9));
            System.out.println(ob.elementSearch(11));
            System.out.println(ob.size());
            System.out.println(ob.peek());
            System.out.println(ob.empty());
        }
    }