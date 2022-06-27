package Collections;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayModifyExample {
    public static void main(String[] args) {
        int arr1[] = new int[2];
        arr1[0] = 10;
        arr1[1] = 20;
        //insert 30 into arr1
        // old.size + 1
        int arr2[] = new int[3];

        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        arr2[2] = 30;
        arr1 = arr2;
//        System.out.println(arr1[2]);


        //ArrayList/Vector -> array?
        ArrayList<Integer> list = new ArrayList<>(); // size is not mandatoru
        // int arr[] = new int[5];
        //clasName<type>  objName = new clasName<type>()
        //Scanner sc = new Scanner(System.in);
        //arr[0]= 10;
        list.add(0, 10); //arr[0] = 10;
        list.add(1, 20); //arr[1] = 20;
        //add the end
        list.add(30); //
//        System.out.println(list); // arr[0]
        list.set(0, 40); // modify
//        System.out.println(list); // arr[0]
        list.add(2, 60);//insert in middle
//        System.out.println(list); // arr[0]
//        System.out.println(list.get(1));
//        System.out.println(list.get(3));

        //size of array list -> list.size() => arr.length

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

//        System.out.println(list.indexOf(60)); //will search and give the index
//        System.out.println(list.indexOf(200)); //
        list.remove(1);
        System.out.println(list);

//
//        //array
//        for(int i=0;i< arr1.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(list.get(4));


    }
}
