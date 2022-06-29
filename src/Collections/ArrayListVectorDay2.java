package Collections;

import java.util.*;

public class ArrayListVectorDay2 {

    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        Scanner  sc = new Scanner(System.in);
        //insert at end
        list.add(10);
        list.add(20);
        list.add(999);
        list.add(500);
        list.add(-10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //add at particular index
//        list.add(1, 333);
//        list.set(1, 444);

//        list.remove(0);
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" "); // arr[i]
//        }
//
//        System.out.println(list);//[444, 20]
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(103);
//        list.addAll(list2);
//
//
//
//
//
//
//
//
//
//
//




    }
}
