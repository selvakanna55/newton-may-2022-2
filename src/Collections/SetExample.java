package Collections;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    void exampleHashSet1() {
        int num = 10;
        HashSet<Integer> uniq = new HashSet<>(); //Hash, Tree, Linkedlist
        uniq.add(10);
        uniq.add(20);
        uniq.add(10);//ignore
        uniq.add(30);
        uniq.add(30);//ignore
        uniq.add(40);
        uniq.add(40);//ignore
        System.out.println(uniq);
        uniq.remove(10);
        System.out.println(uniq);
        System.out.println(uniq.contains(30));
        System.out.println(uniq.contains(100));
    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); // ordering not prdicted
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);

        TreeSet<Integer> ts = new TreeSet<>(); // ordering - sorted
        ts.add(10);
        ts.add(20);
        ts.add(30);
        System.out.println(ts);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // ordering - inserted order
        lhs.add(20);
        lhs.add(10);
        lhs.add(30);
        System.out.println(lhs);

        //System.out.println(lhs[0]);

        //for each i
        for(int num:lhs){
            System.out.print(num+" ");
        }


    }
}
