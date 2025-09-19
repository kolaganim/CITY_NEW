package implementingOwnDS;
public class CietArrayList {
    static int n;
    static int top;
    static int a[];
    public CietArrayList(int n){
        this.n=n;
        a=new int[n];
        top=0;
    }
    public static void increaseMemory(){
        n=(int)(n*1.5);
        int newa[]=new int[n];

        for(int i=0;i<top;i++){
            newa[i]=a[i];
        }
        a=newa;
    }
    public static int size(){
        if(top==0) return 0;
        else
            return top;
    }
    public static boolean addAtLast(int x){
        if(top==n) {
            increaseMemory();
        }
        a[top++]=x;
        return true;
    }
    public static boolean addAtFirst(int x){
        if(top==n) {
            increaseMemory();
        }
        for(int i=top-1;i>=0;i--) {
            a[i + 1] = a[i];
        }
        a[0]=x;
        top++;
        return true;
    }
    public static boolean removeFromLast(){
        if(top==0)
            return false;
        else {
            top--;
            return true;
        }
    }
    public static boolean removeFromFirst(){
        if(top==0) return false;
        int removeEle=a[0];
        for(int i=0;i<top-1;i++){
            a[i]=a[i+1];
        }
        top--;
        return true;
    }
    public static boolean elementSearch(int x){
        for(int i=0;i<top;i++){
            if(a[i]==x){
                return true;
            }
        }
        return false;
    }
    public static boolean setElement(int ind,int num){
        if(ind<=0 || ind>=n){
            return false;
        }
        a[ind]=num;
        return true;
    }
    public static int getElement(int ind){
        if(ind<=0 || ind>=top){
            return -1;
        }
        return a[ind];
    }
}