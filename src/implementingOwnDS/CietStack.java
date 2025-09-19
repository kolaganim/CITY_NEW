package implementingOwnDS;
public class CietStack {
        static int[] a;
        static int top;
        static int n;
        public CietStack( int n) {
            a =new int[n];
            top=0;
            this.n=n;
        }
        public CietStack( ) {
        }
        public static boolean push(int x){
            if(top==n) return false;
            else{
                a[top++]=x;
                return true;
            }
        }
        public static boolean pop(int y){
            if(top==0) return false;
            else{
                a[--top]=y;
                return true;
            }
        }
        public static int size(){
            if(top==0) return 0;
            else
                return top;
        }
        public static boolean elementSearch(int x){
            for(int i=0;i<n;i++){
                if(a[i]==x){
                    return true;
                }
            }
            return false;
        }
        public static int peek( ){
            return a[top-1];
        }

        public static boolean empty(){
            if(top==0)
                return true;
            return false;
        }
    }