package collectionInterface;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArrayList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(12,22,32,42,52,null));
        System.out.println(l1);
        for(Integer i :l1){
            System.out.println(i);
        }
        for(int i =0;i<l1.size();i++) {
            System.out.println(l1.get(i));
        }
        Iterator<Integer> iterator = l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
