package implementingOwnDS;
public class CietArrayListDriver extends CietArrayList {
    public CietArrayListDriver (int n) {
        super(n);
    }
    public static void main(String[] args) {
        int n = 6;
        CietArrayListDriver obj = new CietArrayListDriver(n);
        System.out.println(obj.addAtFirst(6));
        System.out.println(obj.addAtLast(6));
        System.out.println(obj.addAtLast(7));
        System.out.println(obj.addAtLast(8));
        System.out.println(obj.addAtLast(9));
        System.out.println(obj.size());
        System.out.println(obj.removeFromFirst());
        System.out.println(obj.removeFromLast());
        System.out.println(obj.elementSearch(11));
        System.out.println(obj.size());
        System.out.println(obj.getElement(3));
    }
}